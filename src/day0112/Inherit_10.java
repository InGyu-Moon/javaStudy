package day0112;

class Work{
    public void process(){
        System.out.println("아무것도 안하고있음!!!");
    }
}
class Food1 extends Work{
    @Override
    public void process() {
        System.out.println("***음식담당***");
    }
}
class Clean extends Work{
    @Override
    public void process() {
        System.out.println("***청소담당***");
    }
}
class Sing extends Work{
    @Override
    public void process() {
        System.out.println("***노래담당***");

    }
}

public class Inherit_10 {
    public static void main(String[] args) {

        // 다형성
        // 부모클래스로 선언하고 자식클래스로 생성하는 경우
        Work food = new Food1();
        Work sing = new Sing();
        Work clean = new Clean();
        food.process();
        sing.process();
        clean.process();
    }
}
