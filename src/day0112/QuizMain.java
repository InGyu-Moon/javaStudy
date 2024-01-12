package day0112;

import java.util.Scanner;

class Quiz{
    private String name;
    private int java;
    private int oracle;
    private int html;

    public Quiz(String name, int java, int oracle, int html) {
        this.name = name;
        this.java = java;
        this.oracle = oracle;
        this.html = html;
    }
    public int getTotal(){
        return java+oracle+html;
    }
    public double getAverage(){
        return getTotal()/3.0;
    }
    public String getPyungga(){
        if(getAverage()>=90){
            return "장학생";
        } else if (getAverage() >= 80) {
            return "합격";
        }else {
            return "불합격";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getOracle() {
        return oracle;
    }

    public void setOracle(int oracle) {
        this.oracle = oracle;
    }

    public int getHtml() {
        return html;
    }

    public void setHtml(int html) {
        this.html = html;
    }
}

public class QuizMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학교명: ");
        String schoolName = sc.nextLine();

        System.out.print("인원수: ");
        int num = Integer.parseInt(sc.nextLine());

        Quiz [] quizzes = new Quiz[num];

        for(int i=0;i<num;i++){
            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("java: ");
            int java = Integer.parseInt(sc.nextLine());
            System.out.print("oracle: ");
            int oracle = Integer.parseInt(sc.nextLine());
            System.out.print("html: ");
            int html = Integer.parseInt(sc.nextLine());
            quizzes[i] = new Quiz(name,java,oracle,html);
        }
        System.out.println("학교명: "+schoolName);
        System.out.println("이름\t\tJAVA\tORACLE\tHTML\t총점\t\t평균\t\t평가");
        System.out.println("=====================================================");
        for(int i=0;i<num;i++){
            System.out.printf("%s\t%d\t\t%d\t\t%d\t\t%d\t\t%.2f\t\t%s\n",
                    quizzes[i].getName(),quizzes[i].getJava(),quizzes[i].getOracle(),quizzes[i].getHtml(),
                    quizzes[i].getTotal(),quizzes[i].getAverage(),quizzes[i].getPyungga());
        }



    }
}
