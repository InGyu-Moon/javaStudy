package day0115;

// throws - 호출한 영역으로 예회처리를 던짐
// throw - 강제로 예외를 발생시킴

import java.util.Scanner;

public class Throws_15 {

    public static void scoreInput() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = Integer.parseInt(sc.nextLine());
        if(score > 100 || score < 0)
            throw new Exception("잘못된 범위 입니다.");
    }



    public static void main(String[] args) {
        try {
            scoreInput();
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
        System.out.println("정상종료");

    }
}
