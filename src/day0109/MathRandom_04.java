package day0109;

public class MathRandom_04 {
    public static void main(String[] args) {
        // 자바에서 난수를 사용하는 방법
        // 1. Math.Random() 메서드 사용
        // 2. Random 클래스 사용

        System.out.println("기본 랜덤수 5개 발생");
        for(int i=1;i<=5;i++){
            double a = Math.random();
            System.out.println("a = " + a);
        }

        System.out.println("----------------------------");

        System.out.println("0~9 랜덤수 5개 발생");
        for(int i=1;i<=5;i++){
            int a = (int) (Math.random() * 10);
            System.out.println("a = " + a);
        }

        System.out.println("----------------------------");

        System.out.println("0~99 랜덤수 5개 발생");
        for(int i=1;i<=5;i++){
            int a = (int) (Math.random() * 100);
            System.out.println("a = " + a);
        }

        System.out.println("----------------------------");

        System.out.println("1~10 랜덤수 5개 발생");
        for(int i=1;i<=5;i++){
            int a = (int) (Math.random() * 10)+1;
            System.out.println("a = " + a);
        }
    }
}
