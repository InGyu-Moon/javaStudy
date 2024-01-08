package day0105;

import java.util.Scanner;

public class SwitchMonth_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("현재 월을 입력하세요: ");
        int month = Integer.parseInt(sc.nextLine());

        switch(month){
            case 1:case 3:case 5:
            case 7:case 8:case 10:case 12:
                System.out.println("31일 까지 있습니다.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30일 까지 있습니다.");
                break;
            case 2:
                System.out.println("28일 or 29일까지 있습니다.");
            default:
                System.out.println("존재하지 않는 달 입니다.");
        }

    }
}
