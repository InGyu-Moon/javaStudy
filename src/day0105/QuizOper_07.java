package day0105;

import java.util.Scanner;

public class QuizOper_07 {
    public static void main(String[] args) {
        // 여러분이 받은 알바비를 입력한뒤, 만원,천원,백원,십원,일원의 개수를 출력하시오

        /**
         * 알바비는?    568712
         *
         *
         * 만원: 56
         */

        Scanner sc = new Scanner(System.in);


        System.out.print("알바비는? ");
        int input = Integer.parseInt(sc.nextLine());

        System.out.println("만원: "+input/10000);
        System.out.println("천원: "+input%10000/1000);
        System.out.println("백원: "+input%1000/100);
        System.out.println("십원: "+input%100/10);
        System.out.println("일원: "+input%10);



    }
}
