package day0105;

import java.util.Scanner;

public class QuizOper_13 {
    public static void main(String[] args) {
        // 3개의 숫자를 입력하여 가장 큰값 max를 구하시오

        Scanner sc = new Scanner(System.in);

        int max;

        System.out.println("숫자 3개를 입력하세요.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        max = num1>num2?num1:num2;
        max = max>num3?max:num3;
        System.out.println("max = " + max);

        if(num1>num2){
            max = num1;
        }
        else{
            max = num2;
        }

        if(max>num3){
            max = max;
        }
        else{
            max = num3;
        }

        System.out.println("max = " + max);


    }
}
