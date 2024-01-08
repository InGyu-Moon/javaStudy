package day0108;

import java.util.Scanner;

public class OperYoon_04 {
    public static void main(String[] args) {
        // 윤년공식: year%4==0 && year %100!=0 || year%400==0

        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        System.out.print("연도를 입력하세요: ");
        int year = sc.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();

        // 월 잘못 입력시 프로그램 종료
        if(month>12 || month<1){
            System.out.println("월을 잘못 입력하였습니다.");
            return;
        }
        //윤년인지 아닌지
        if(year%4==0 && year %100!=0 || year%400==0)
            flag = true;


        switch(month){
            case 1:case 3:case 5:
            case 7:case 8:case 10:case 12:
                System.out.println("31일 까지 있습니다.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30일 까지 있습니다.");
                break;
            case 2:
                if(flag)
                    System.out.println("29일까지 있습니다.");
                else
                    System.out.println("28일까지 있습니다.");

            default:
                System.out.println("존재하지 않는 달 입니다.");
        }



    }
}
