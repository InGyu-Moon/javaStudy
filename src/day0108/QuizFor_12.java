package day0108;

import java.util.Scanner;

public class QuizFor_12 {
    public static void main(String[] args) {

        System.out.println("1. 1 2 4 5 7 8 10 (continue 사용)");

        for(int i=1;i<=10;i++){
            if(i%3==0)
                continue;
            System.out.print(i+"  ");
        }

        System.out.println("2. 홀수값: 1   홀수값: 3   홀수값: 5   홀수값: 7   홀수값: 9");

        for(int i=1;i<=10;i++){
            if(i%2==1)
                System.out.println("홀수값: "+i);
        }

        System.out.println("3. 점수를 입력후 합계를 구하는데, 0을 입력하면 합계를 출력");

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("숫자를 입력해주세요(0 입력시 종료):");
            int input = sc.nextInt();
            if(input==0)
                break;
            sum+=input;
        }

        System.out.println("sum = " + sum);


    }
}
