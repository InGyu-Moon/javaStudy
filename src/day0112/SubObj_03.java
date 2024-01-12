package day0112;

public class SubObj_03 extends SuperObj_03{
    String addr;

    public SubObj_03(String name, int age, String addr) {
        super(name, age); // 반드시 첫줄에
        this.addr = addr;
    }

    public void printData(){
        System.out.println("name = " + this.name); // this 생략가능
        System.out.println("age = " + age);
        System.out.println("addr = " + addr);
    }



}
