package day0105;

import java.util.Scanner;

public class QuizOper_14 {
    public static void main(String[] args) {
        /**
         * 이름을 입력해주세요           김민아
         * 자바 시험 점수를 입력해주세요     88
         *
         * ================================
         * 김민아님의 시험평가는 잟함 입니다.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력해주세요 ");
        String name = sc.nextLine();
        System.out.print("자바 시험 점수를 입력해주세요 ");
        int score = sc.nextInt();

        String str1, str2;
        str1 = score>=90?"매우잘함":
                score>=80?"잘함":
                        score>=70?"좀더노력할것":"꽝!!";

        if(score>=90)
            str2="매우잘함";
        else if (score >= 80)
            str2="잘함";
        else if (score >= 70)
            str2="좀더노력할것";
        else
            str2="꽝!!";


        System.out.println("================================");
        System.out.println(name+"님의 시험평가는 "+str1+"입니다");
        System.out.println(name+"님의 시험평가는 "+str2+"입니다");
        System.out.println("================================");





    }
}
