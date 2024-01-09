package day0109;

import java.util.Random;
import java.util.Scanner;

public class RandomSu_06 {
    public static void main(String[] args) {
        // 1~10 사이의 랜덤수를 발생사켜 그 숫자 맞추기

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int randomNumber = r.nextInt(10) + 1;

        while(true){
            System.out.print("숫자를 입력하세요: ");
            int user = sc.nextInt();

            if(user==randomNumber){
                System.out.println("정답입니다.");
                break;
            }
            System.out.println("틀렸습니다.");
        }

    }
}
