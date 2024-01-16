package day0116;

class OuterObject{
    int a = 10;
    static int b = 20;

    class InnerObject{
        int c = 30;
        public void write(){
            System.out.println("외부 인스턴스 변수 a = " + a);
            System.out.println("외부 정적변수 b = " + b);
            System.out.println("내부 인스턴스 변수 c = " + c);
        }

    }

    static class InnerObject2{
        int d = 40;
        static int e = 50; // 내부클래스 맴버를 static으로 선언하고 싶으면 내부 클래스 타입을 static으로 선언해야한다.

        public void write2(){
            // System.out.println("외부 인스턴스 변수 a = "+ a); // 스태틱 내부 클래스는 외부 일반변수 접근안됨
            System.out.println("외부 정적변수 b = " + b);
            System.out.println("내부 일반변수 d = " + d);
            System.out.println("내부 정적변수 e = " + e);

        }
    }

}


public class InnerClass_07 {
    public static void main(String[] args) {

        OuterObject.InnerObject inobj = new OuterObject().new InnerObject();
        inobj.write();

        OuterObject.InnerObject2 innerObject2 = new OuterObject.InnerObject2();
        innerObject2.write2();


    }
}
