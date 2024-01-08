package day0108;

import java.util.Scanner;

public class OperReview_01 {
    public static void main(String[] args) {
        // importm 선언, 입력, 계산, 출력
        Scanner sc = new Scanner(System.in);

        String name;
        int kor,eng,mat;

        System.out.println("이름?");
        name = sc.nextLine();

        System.out.println("국영수 점수?");
        kor = sc.nextInt();
        eng = sc.nextInt();
        mat = sc.nextInt();

        int sum = kor + eng + mat;
        double avg = sum / 3.0;

        /*
        System.out.printf("3 과목의 점수: %d,%d,%d\n",kor,eng,mat);
        System.out.printf("평균: %5.2f\n",avg);

        System.out.println("***합격 조건: 평균이 60점 이상이고 각 과목이 모두 40점 이상이면 합격***");
        System.out.println("==============================================================");

        if(avg >= 60 && kor >= 40 && eng >= 40 && mat >= 40)
            System.out.println(name+" 님은 합격입니다.");
        else
            System.out.println(name+" 님은 불합격입니다.");
         */

        // 삼항 연산자
        System.out.printf("평균: %5.1f\n",avg);
        System.out.println("***평가 -> 80점이상: 매우잘함, 70점이상: 좀더 노력, 70점 미만: 불합격***");
        System.out.println("평가: "+(avg>=80?"매우잘함":avg>=70?"좀더 노력":"불합격"));


    }
}
