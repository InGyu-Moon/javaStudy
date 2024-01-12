package day0112;

class Color{
    public void hello(){
        System.out.println("Hello");
    }
}
class Red extends Color{
    public void process(){
        System.out.println("My car is red");
    }
}
class Green extends Color{
    public void process(){
        System.out.println("My car is green");
    }
}
class Blue extends Color{
    public void process(){
        System.out.println("My car is blue");
    }
}
class Pink extends Color{
    public void process(){
        System.out.println("My car is pink");
    }
}



public class Inherit_09 {
    public static void main(String[] args) {
        System.out.println("1. Red 선언하고 Red 생성한 경우");
        Red red = new Red();
        red.hello();
        red.process();

        System.out.println("1. Green 선언하고 Green 생성한 경우");
        Green green = new Green();
        green.hello();
        green.process();

        System.out.println("3. Blue 선언하고 Blue 생성한 경우");
        Blue blue = new Blue();
        blue.hello();
        blue.process();

        System.out.println("4. Pink 선언하고 Pink 생성한 경우");
        Pink pink = new Pink();
        pink.hello();
        pink.process();


        //부모로 선언하고 자식클래스로 생성
        Color redColor = new Red();
        redColor.hello();











    }
}
