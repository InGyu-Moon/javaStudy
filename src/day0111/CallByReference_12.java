package day0111;

class MyCar{
    String carName;
    int carPrice;
    String carColor;

}


public class CallByReference_12 {

    public static void dataIn(MyCar car){
        car.carName="미니쿠퍼";
        car.carPrice=4200000;
        car.carColor="진주색";
    }

    public static void dataOut(MyCar car){
        System.out.println("차종명: "+car.carName);
        System.out.println("차량가격: "+car.carPrice);
        System.out.println("색상: "+car.carColor);
    }

    public static void main(String[] args) {
        MyCar car = new MyCar();

        // 두 메서드 다 주소가 전달되므로 결국 메인의 car
        dataIn(car);
        dataOut(car);
    }
}
