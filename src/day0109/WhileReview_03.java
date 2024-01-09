package day0109;

import java.util.Scanner;

public class WhileReview_03 {
    public static void main(String[] args) {
        /**
         * 반복적으로 나이를 입력한다 0이 되면 종료
         * 나이가 50이상이면 a증가
         * 30이상이면 b 증가
         * 그 외 c 증가
         */

        Scanner sc = new Scanner(System.in);
        int a=0,b=0,c=0;

        while (true){

            System.out.print("나이를 입력하세요(0입력시 종료):");
            int input = sc.nextInt();

            if(input==0)
                break;;

            if(input >= 50)
                a++;
            else if(input >= 30)
                b++;
            else
                c++;
        }

        System.out.println("50세 이상: "+a+"명");
        System.out.println("30세 이상: "+b+"명");
        System.out.println("그외: "+c+"명");





    }
}
