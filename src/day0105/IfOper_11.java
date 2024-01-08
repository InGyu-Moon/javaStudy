package day0105;

import java.util.Scanner;

public class IfOper_11 {
    public static void main(String[] args) {
        // if 문과 삼항연산자 비교

        Scanner sc = new Scanner(System.in);
        int score = Integer.parseInt(sc.nextLine());
        char grade;


        switch (score/10){
            case 10:
            case 9:
                grade='A';
                break;
            case 8:
                grade='B';
                break;
            case 7:
                grade='C';
                break;
            case 6:
                grade='D';
                break;
            default:
                grade='F';

        }

        System.out.println("grade = " + grade);


    }
}
