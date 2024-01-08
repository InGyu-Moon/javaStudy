package day0104;

public class DataType_08 {
    public static void main(String[] args) {
        // 묵시적 형변환은 자동으로 결정되는 타입
        // String+int 는 String 이다.
        // double+int 는 double 이다.
        // long+short 는 long 이다.

        char a = 'A'; // 65의 아스키코드
        // char는 내부적으로 아스키코드 값으로 인식

        System.out.println(a+32);
        System.out.println("Happy"+5+6);
        System.out.println("Happy"+(5+6));
        System.out.println('A'+3);
        System.out.println(2+'B');

        System.out.println('a'+'b');


    }
}
