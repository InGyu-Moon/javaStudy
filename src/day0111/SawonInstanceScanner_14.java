package day0111;

import java.util.Scanner;

class Emp{
    private String name;
    private int sal;
    private int family;
    private int overTime;

    public int getFamilyBonus(){
        if(family>=2)
            return 100_000;
        return 50_000;
    }
    public int getTimeBonus(){
        if(overTime>=10)
            return 300_000;
        return overTime*3_000;
    }
    public int getTotalSal(){
        return sal+this.getFamilyBonus()+this.getTimeBonus();
    }

    public static void showTitle(){
        System.out.println("***쌍용 01월 직원 급여 현황***");
        System.out.println();
        System.out.println("사원명\t기본급\t자녀수\t초과근무시간\t가족수당\t시간수당\t총급여");
        System.out.println("==============================================================");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getFamily() {
        return family;
    }

    public void setFamily(int family) {
        this.family = family;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }
}


public class SawonInstanceScanner_14 {

    public static void writeEmp(Emp [] emps){
        Emp.showTitle();
        for(Emp e:emps){
            System.out.println(e.getName()+"\t"+e.getSal()+"\t\t"+e.getFamily()+"\t\t"+e.getOverTime()+"\t\t"+e.getFamilyBonus()+"\t"+e.getTimeBonus()+"\t"+e.getTotalSal());
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("인원수를 입력하세요: ");
        int totalEmp = Integer.parseInt(sc.nextLine());

        Emp [] emps = new Emp[totalEmp];

        for(int i=0;i<totalEmp;i++){
            emps[i] = new Emp();
            System.out.println((i+1)+"번째 사원");
            System.out.print("사원 이름을 입력하세요: ");
            emps[i].setName(sc.nextLine());
            System.out.print("사원 기본급을 입력하세요: ");
            emps[i].setSal(Integer.parseInt(sc.nextLine()));
            System.out.print("사원 자녀수 입력하세요: ");
            emps[i].setFamily(Integer.parseInt(sc.nextLine()));
            System.out.print("사원 초과근무시간을 입력하세요: ");
            emps[i].setOverTime(Integer.parseInt(sc.nextLine()));
        }
        writeEmp(emps);



    }
}
