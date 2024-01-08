package day0108;

import java.util.Scanner;

public class ForGugu_14 {
    public static void main(String[] args) {
/*
        for(int i=2;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
            System.out.println();
        }

        loop: for(int i=2;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(i==j)
                    break loop;
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
            System.out.println();
        }

        System.out.println("Q. 단을 입력하면 해당 단이 나오게 해주세요");
        Scanner sc = new Scanner(System.in);

        System.out.print("단을 입력하세요: ");
        int input = sc.nextInt();

        // 잘못입력한경우
        if(input>9 || input <2){
            System.out.println("다시 입력홰주세요");
            return;
        }


        System.out.println("["+input+"단]");
        for(int i=1;i<=9;i++){
            System.out.printf("%d * %d = %d\n",input,i,input*i);
        }

 */
        System.out.println("가로 방향으로 구구단 출력");

        for(int i=0 ;i<=9;i++){
            for(int j=2;j<=9;j++){
                System.out.printf("%d * %d = %2d   ",j,i,i*j);
            }
            System.out.println();
        }


    }
}
