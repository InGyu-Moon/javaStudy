package day0104;

public class QuizDataType_10 {
    public static void main(String[] args) {
        // 변수는 args를 이용할것
        /**
         * 학생명: 김선호 님
         * 지역: 부산
         * 나이: 23 세
         *
         * =====================
         * 김선호님의 자바 점수는 88점 오라클점수는 77점 총 165점 입니다.
         *
         */

        String name = args[0];
        String location = args[1];
        int age = Integer.parseInt(args[2]);
        int java = Integer.parseInt(args[3]);
        int oracle = Integer.parseInt(args[4]);

        System.out.printf("학생명: %s 님\n",name);
        System.out.printf("지역: %s\n",location);
        System.out.printf("나이: %d 세\n\n",age);
        System.out.printf(" =====================\n");
        System.out.printf("%s님의 자바 점수는 %d점 오라클점수는 %d점 총 %d점 입니다.",name,java,oracle,java+oracle);

    }
}
