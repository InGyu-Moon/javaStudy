package day0109;

import java.util.Scanner;

public class StringIn_01 {
    public static void main(String[] args) {
        //  반복적인 이름을 입력해서 김씨가 몇명인지? 끝이라고 쓰면 종료

        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        while(true){
            System.out.print("이름 입력 (끝이라고 입렷시 종료): ");
            String name = sc.nextLine();

            if(name.equals("끝"))
                break;
            //if(name.substring(0,1).equals("김"))
            if(name.startsWith("김"))
                cnt++;

        }
        System.out.println("cnt = " + cnt);
    }
}
