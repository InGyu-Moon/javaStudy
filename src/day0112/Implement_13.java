package day0112;

// 상수와 추상 메서드만 가질수 있다.
interface FoodShop{
    String SHOP_NAME="남소관"; // 상수 final 생략한다.
    void Order(); // 추상 메서드 abstract 생략한다.
    void bedal();
}

class Food2 implements FoodShop{
    @Override
    public void Order() {
        System.out.println("음식을 주문합니다.");
    }

    @Override
    public void bedal() {
        System.out.println("음식을 배달합니다.");
    }
}

public class Implement_13 {
    public static void main(String[] args) {
        FoodShop fs;
        fs = new Food2();
        fs.Order();
        fs.bedal();
    }
}
