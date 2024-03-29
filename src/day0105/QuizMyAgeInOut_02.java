package day0105;

import java.util.Calendar;
import java.util.Scanner;

public class QuizMyAgeInOut_02 {
    public static void main(String[] args) {
        /**
         * 당신의 이름은? ==> 이수연
         * 당신의 태어난 연도는? ==> 1988
         * 당신이 사는 지역은? ==> 경기
         *
         * ==========================
         *[이수연 님의 개인정보]
         * ==========================
         * 이름: 이수연
         * 태어난년도: 1988
         * 나이: **세
         * 지역: 경기
         *
         */

        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        System.out.print("당신의 이름은? ==>");
        String name = scanner.nextLine();

        System.out.print("당신의 태어난 연도는? ==>");
        String year = scanner.nextLine();

        int intYear = Integer.parseInt(year);
        int curYear = calendar.get(Calendar.YEAR);
        int age = curYear-intYear;


        System.out.print("당신이 사는 지역은? ==>");
        String city = scanner.nextLine();

        System.out.println("==========================");
        System.out.println("["+name+" 님의 개인정보]");
        System.out.println("==========================");
        System.out.println("이름: "+name);
        System.out.println("태어난년도: "+year);
        System.out.println("나이: "+age+" 세");
        System.out.println("지역: "+city);

    }
}
