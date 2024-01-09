package day0109;

import java.util.Scanner;

public class Book175_14 {
    public static void main(String[] args) {
        // 학생명과 점수를 입력 (몇명인지는 입력)
        // 입력해준 데이터로 출력을 하고 합계도 구해보자

        Scanner sc = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int student = Integer.parseInt(sc.nextLine());

        String [] name = new String[student];
        int [] score = new int[student];

        int sum=0;

        for(int i=0;i<student;i++){
            System.out.print((i+1)+"번째 학생 이름: ");
            name[i] = sc.nextLine();

            System.out.print((i+1)+"번째 학생 점수: ");
            score[i] = Integer.parseInt(sc.nextLine());

            sum += score[i];
        }

        double avg = (double) sum / student;

        System.out.println("번호\t이름\t점수");

        for(int i=0;i<student;i++){
            System.out.println((i+1)+"\t"+name[i]+"\t"+score[i]);
        }

        System.out.println("avg = " + avg);



    }
}
