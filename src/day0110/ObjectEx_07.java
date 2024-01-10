package day0110;

public class ObjectEx_07 {

    String name; //인스턴스 변수 -> 반드시 생성을 하고 사용해야한다.
    static final String MESSAGE = "Happy day"; // static 맴버 변수, 클래스 생성없이 사용가능

    public static void main(String[] args) {

        // static 변수는 객체생성없이 사용 가능하다
        // 다른 클래스에서는 클래스명.변수명으로 가져와야한다. (ObjectEx_07.MESSAGE)
        System.out.println(MESSAGE);

        // 인스턴스 변수는 객체를 생성해야된다.
        //System.out.println(name);
        ObjectEx_07 ob7 = new ObjectEx_07();
        System.out.println(ob7.name);
        ob7.name="홍길동";
        System.out.println(ob7.name);


    }





}
