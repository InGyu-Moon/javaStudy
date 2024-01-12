package day0112;

class Car{
    private String carCompany;
    private String carType;
    public Car() {
        carCompany="현대";
        carType="전기차";
    }

    public Car(String carCompany, String carType) {
        this.carCompany = carCompany;
        this.carType = carType;
    }
    public void printData(){
        System.out.println("회사명: "+carCompany);
        System.out.println("종류: "+carType);
    }
}
class MyCar extends Car{
    private String carName;
    private String carColor;
    private int carPrice;

    public MyCar() {
        this.carName = "아이오닉5";
        this.carColor = "블랙";
        this.carPrice = 35_000_000;
    }

    public MyCar(String carCompany, String carType, String carName, String carColor, int carPrice) {
        super(carCompany, carType);
        this.carName = carName;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("자동차명: "+carName);
        System.out.println("색상: "+carColor);
        System.out.println("가격: "+carPrice+"원");
    }
}



public class Inherit_08 {
    public static void main(String[] args) {
        MyCar myCar1 = new MyCar();
        MyCar myCar2 = new MyCar("기아","가솔린","코나","화이트",25_000_000);

        System.out.println("**디폴트 생성자로 생성**");
        myCar1.printData();

        System.out.println();

        System.out.println("**명시적 생성자로 생성**");
        myCar2.printData();
    }
}
