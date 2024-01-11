package day0111;


class Apple{
    public Apple(){
        System.out.println("Apple_디폴트생성자");
    }
}
class Banana{
    public Banana(String str){
        System.out.println("생성자 호출: "+str);

    }
}
class Orange{
    public Orange(){
        System.out.println("Orange의 디폴트 생성자");
    }
    public Orange(String str){
        System.out.println("Orange의 두번쨰 생성자: "+str);
    }
    public Orange(int n){
        this(); // 기본 생성자 호출, 반드시 첫줄
        System.out.println("Orange의 세번쨰 생성자: "+n);
    }


}

public class ConstTest_02 {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Banana banana = new Banana("banana");
        Orange orange = new Orange(1);





    }
}
