package day0108;

import java.util.Scanner;

public class QuizForWhile_15 {
    public static void main(String[] args) {
        test4();
    }
    public static void test1(){
        // 문제 1. 1~100까지의 3의 배수 개수 구하기;
        int cnt=0;
        int n=0;
        while(true){
            n++;
            if(n%3==0)
                cnt++;
            if(n==100)
                break;
        }
        System.out.println("cnt = " + cnt);
    }
    public static void test2(){
        // 1~100 짝수합 - while
        int sum=0;
        int n=0;
        while(true){
            n++;
            if(n%2==0)
                sum+=n;
            if(n==100)
                break;
        }
        System.out.println("sum = " + sum);
    }
    public static void test3(){
        // 1~100 홀수합 - for
        int sum=0;
        for(int i=0;i<=100;i+=2){
            sum+=i;
        }
        System.out.println("sum = " + sum);
    }
    public static void test4(){
        /**
         * 1번 점수: 90
         * 2번 점수: -70 -> 잘못입력했어요 (계산 x)
         * 2번 점수:
         */

        Scanner sc = new Scanner(System.in);

        int sum=0;

        for(int i=1;i<=5;i++){
            System.out.print(i+"번 점수: ");
            int input = sc.nextInt();
            if(input<1 || input>100){
                System.out.println("잘못입력했어요");
                i--;
                continue;
            }
            sum+=input;
        }

        /*
        int cnt=1;
        while(cnt<=5){
            System.out.print(cnt+"번 점수: ");
            int input = sc.nextInt();
            if(input<1 || input>100){
                System.out.println("잘못입력했어요");
                continue;
            }
            cnt++;
            sum+=input;
        }
        */

        System.out.println("총점: " + sum+"점");

    }
}
