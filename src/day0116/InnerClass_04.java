package day0116;

class OuterObj{

    public void display(){
        System.out.println("외부 클래스에 display 메서드");
        System.out.println("외부에서 내부클래스의 메서드 호출");

        InnerObj innerObj = new InnerObj();
        innerObj.write();

    }


    // 내부 클래스
    class InnerObj{
        public void write(){
            System.out.println("내부 클래스의 write 메서드");
        }
    }

}

public class InnerClass_04 {
    public static void main(String[] args) {
        OuterObj outerObj = new OuterObj();
        outerObj.display();
    }
}
