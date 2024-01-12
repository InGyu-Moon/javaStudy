package day0112;

/**
 * 추상클래스
 * 추상클래스는 new로 생성하지 못한다
 * abstract 메서드는 abstract 클래스에서만 존재할수 있다.
 * abstract 클래스는 일반메서드 추상메서드 둘다 포함 가능하다.
 */

abstract class Fruit{
    public static final String MESSAGE = "오늘은 추상클래스 배우는날";

    // 일반메서드
    public void showTitle(){
        System.out.println("일반메서드입니다.");
    }
    // 추상메서드 (미완성 메서드, 구현부가 없다) -> 오버라이딩이 목적
    public abstract void showMessage();
}
class Apple extends Fruit{
    @Override
    public void showMessage() {
        System.out.println(Fruit.MESSAGE);
        System.out.println("Apple_MESSAGE");
    }
}
class Banana extends Fruit{
    @Override
    public void showMessage() {
        System.out.println("Banana_MESSAGE");
    }
}
class Orange extends Fruit{
    @Override
    public void showMessage() {
        System.out.println("Orange_MESSAGE");
    }
}

public class Abstract_11 {
    public static void main(String[] args) {
        Fruit fruit;

        fruit = new Apple();
        fruit.showMessage();

        fruit = new Banana();
        fruit.showMessage();

        fruit = new Orange();
        fruit.showMessage();

    }
}
