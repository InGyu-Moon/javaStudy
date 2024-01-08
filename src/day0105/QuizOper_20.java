package day0105;

import java.util.Scanner;

public class QuizOper_20 {
    public static void main(String[] args) {
        /**
         * (상품을 5개 이상 구매시 10%할인하여 계산된다)
         * 상품명: 키보드
         * 수량: 5
         * 가격: 20000
         * ===========================
         * 5개 이상 구매시 10% 할인됩니다.
         * 키보드 3개는 총 90000원 입니다.
         * 할인된 금액: 10000원
         */

        Scanner sc = new Scanner(System.in);
        
        System.out.print("상품명: ");
        String product = sc.nextLine();

        System.out.print("수량: ");
        int cnt = sc.nextInt();

        System.out.print("가격: ");
        int cost = sc.nextInt();

        System.out.println("======================");
        System.out.println("5개 이상 구매시 10% 할인됩니다.");

        double total = cost*cnt;
        double discount=0;

        if(cnt>=5){
            discount = total*0.1;
            total *=0.9;
        }

        System.out.printf("%s %d개는 총 %.1f원 입니다.\n",product,cnt,total);
        System.out.println("할인된 금액: "+discount+"원");





    }
}
