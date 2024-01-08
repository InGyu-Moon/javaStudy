package day0108;

import java.util.Scanner;

public class Quiz_18 {
    public static void main(String[] args) {
        quiz_2();
    }
    public static void quiz_1(){
        // Q. 반복해서 숫자를 입력하여 양수의 개수와 음수의 개수를 구하시오 (0입력시종료)

        Scanner sc = new Scanner(System.in);

        int n=0,p=0;

        while(true){
            System.out.print("숫자를 입력하세요 ( 0 입력시 종료): ");
            int input = sc.nextInt();

            if(input > 0){
                p++;
            } else if (input < 0) {
                n++;
            }
            else{
                break;
            }
        }
        System.out.println("양수의 개수: "+p);
        System.out.println("음수의 개수: "+n);




    }
    public static void quiz_2(){
        // 반복해서 점수를 입력받고 (1~100) 0입력시 빠저나와 개수와 함계와 평균을 구하시오
        // 범위에 맞지않는 점수는 횟수에서 제외되어야 한다.

        Scanner sc = new Scanner(System.in);
        int sum=0;
        int cnt=0;

        while(true){
            System.out.println("숫자를 입력하세요: ");
            int input = sc.nextInt();
            if(input == 0)
                break;
            if(input > 100 || input < 1)
                continue;
            sum += input;
            cnt++;
        }
        System.out.println("cnt = " + cnt);
        System.out.println("sum = " + sum);

    }
}
