package day0104;

public class DataType_06 {
    public static void main(String[] args) {
        //기본 자료형 8개

        // 1. 기본값이 false 단, 클래스에서만 자동으로 기본값이 설정된다.
        boolean flag = false; //논리형 true, false

        // 2. 문자형, 하나의 문자, 16바이트 유니코드값 표현
        // 기본적으로 정수형, 아스키 코드로 변경이 가능
        char ch1 = 'a'; // 문자형은 소따옴표
        char ch2 = '가'; // c에서는 1바이트, 한글 불가 but java는 2바이트, 한글 가능

        // 3.정수형
        byte a = 127; // 1바이트 -128~127
        short b = 32767; // 16비트, 2바이트
        int c = 2147483647; // 32비트, 4바이트
        long d = 100L; // 64비트, 8바이트, 뒤에 L을 붙혀야 long, int 알수있으므로 L을 추가해주자.

        // 실수
        float f = 3.12f; //32비트, 뒤애 f를 써줘야 한다.
        double df = 123.123; // 64비트, 실수는 double 기본



        // 출력
        System.out.println("flag: "+flag);

        System.out.println("문자형 ch: "+ch1);

        System.out.println("정수 a: " + a);
        System.out.println("정수 b: " + b);
        System.out.println("정수 c: " + c);
        System.out.println("정수 d: " + d);

        System.out.println("실수형 f: "+f);
        System.out.println("실수형 df: "+df);

    }
}
