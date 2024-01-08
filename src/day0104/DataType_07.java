package day0104;

public class DataType_07 {
    public static void main(String[] args) {
        // byte a = 128; 에러발생
        byte a = (byte)128; // 127 -> -128, 더 작은 자료형으로의 변환, 값손실

        System.out.println(a);

        // 강제 형변환(cast 연산자)를 올바르게 사용하는 경우
        int x=7;
        int y=4;

        System.out.println(x/y); // 정수형 끼리의 계산 결과는 정수형이다. 7/4=1
        System.out.println((double)x/y); // 강제형변환으로 실수 나눗셈이 된다.
        System.out.println(x/(double)y);

        //형변환
        double d = 100.0;
        int i=100;
        int result1 = (int)d+i;
        double result2 = d+i;

        System.out.println("d = " + d);
        System.out.println("i = " + i);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
