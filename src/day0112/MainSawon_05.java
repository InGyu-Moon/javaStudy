package day0112;

import day0112_1.Sawon_05;

class My extends Sawon_05 {
    int age;

    public My(String name, String depart, int age) {
        this.name=name;
        this.depart=depart;
        this.age = age;
    }

    public void writeMy(){
        System.out.println("**My에서 만든 메서드**");
        System.out.println("name = " + name);
        System.out.println("depart = " + depart);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("나이==>"+this.age);
        System.out.println("자식이 오버라이드한 메서드");
    }
}


public class MainSawon_05 {
    public static void main(String[] args) {
        My my = new My("이영자","인사부",22);
        my.writeMy();
        my.display();
    }
}
