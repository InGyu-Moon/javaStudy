package day0105;

import java.util.Scanner;

public class QuizOper_19 {
    public static void main(String[] args) {

        /**
         * (90점 이상 참 잘함, 80점 이상 좀더 노력하세요, 80점 미만 불합격)
         * 이름을 입력하세요                손흥민
         * 국,영,수 점수를 입력하세요      88 99 77
         *
         * =========================
         * [손흥민 님의 기말고사 성적]
         * 총점: **점
         * 평균: **.*점
         * 평가:
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        String name = sc.nextLine();

        System.out.println("국,영,수 점수를 입력하세요");
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();

        int sum = kor+eng+math;
        double avg = (double)sum /3;

        System.out.println("=========================");
        System.out.println("[손흥민 님의 기말고사 성적]");
        System.out.println("총점: "+sum+"점");
        System.out.printf("평균: %.1f점\n",avg);

        switch ((int)avg/10){
            case 10: case 9:
                System.out.println("참 잘함");
                break;
            case 8:
                System.out.println("좀더 노력하세요");
                break;
            default:
                System.out.println("불합격");
        }


    }
}
