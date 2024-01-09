package day0109;

import java.util.Random;

public class Random_05 {
    public static void main(String[] args) {
        // Random 클래스 이용

        Random r = new Random();

        System.out.println("0~9사이의 난수 5개 발생");
        for(int i=0;i<5;i++){
            int a = r.nextInt(10);
            System.out.println("a = " + a);
        }

        System.out.println("1~10사이의 난수 5개 발생");
        for(int i=0;i<5;i++){
            int a = r.nextInt(10)+1;
            System.out.println("a = " + a);
        }

        System.out.println("65~90사이의 난수 5개 발생");
        for(int i=0;i<5;i++){
            int a = r.nextInt(26)+65;
            System.out.println((char)a); //알파벳
        }
    }
}
