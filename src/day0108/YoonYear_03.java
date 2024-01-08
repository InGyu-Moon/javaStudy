package day0108;

import java.util.Scanner;

public class YoonYear_03 {
    public static void main(String[] args) {
        // 1. 4로 나누어 나머지가 0 이면 윤년
        // 2. 100으로 나누어 나머지가 0 이 아니거나
        // 3. 400으로 나누어 나머지가 0 이면 윤년

        Scanner sc = new Scanner(System.in);

        System.out.println("입력 연도: ");
        int year = sc.nextInt();

        if(year%4==0 && year %100!=0 || year%400==0)
            System.out.println("윤년");
        else
            System.out.println("평년");

    }
}
