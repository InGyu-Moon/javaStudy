package day0105;

import java.util.Scanner;

public class OperTest_08 {
    public static void main(String[] args) {
        // 신체검사를 하는데 이름과, 키, 몸무게 입력하면
        // 표준 몸무게를 출력해보기 (키-100)*0.9 소수점 한자리

        /**
         * 당신의 이름? 이효리
         * 키? 165
         * 몸무게? 55
         *
         * 이효리님의 표준 몸무게는 55키로입니다.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이름? ");
        String name = sc.nextLine();

        System.out.print("당신의 키? ");
        double height = Double.parseDouble(sc.nextLine());

        System.out.print("당신의 몸무게? ");
        double weight = Double.parseDouble(sc.nextLine());

        double w = (height-100)*0.9;

        System.out.println("========================");
        System.out.printf("%s님의 권장 표준 몸무게는 %.1fKg 입니다.",name,w);




    }
}
