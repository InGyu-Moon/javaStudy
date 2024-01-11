package day0111;

class Student{
    private String name;
    private String hp;
    private int score;

    public Student(String name, String hp, int score) {
        this.name = name;
        this.hp = hp;
        this.score = score;
    }
    public void writeData(){
        System.out.println("name = " + name);
        System.out.println("hp = " + hp);
        System.out.println("score = " + score);
    }

}

public class ArrObTest_10 {
    public static void main(String[] args) {
/*
        Student [] students = new Student[3];

        students[0] = new Student("이름1","010-1111-1111",80);
        students[1] = new Student("이름2","010-2222-2222",64);
        students[2] = new Student("이름3","010-3333-3333",43);

 */

        Student [] students ={
                new Student("이름1","010-1111-1111",80),
                new Student("이름2","010-2222-2222",64),
                new Student("이름3","010-3333-3333",43)
        };

        for(int i=0;i<students.length;i++){
            students[i].writeData();
            System.out.println("--------------------------");
        }

        System.out.println("=======================================");

        for(Student student:students){
            student.writeData();
            System.out.println("--------------------------");
        }






    }
}

