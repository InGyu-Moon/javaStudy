package day0104;

public class DataType_09 {
    public static void main(String[] args) {
        //args를 이용한 연산

        // 변수 선언
        int java = Integer.parseInt(args[0]);
        int jsp = Integer.parseInt(args[1]);
        int spring =Integer.parseInt(args[2]);

        // 계산
        int total = java+jsp+spring;
        int count =3;

        double avg1 = total/count;
        double avg2 = (double) total/count;

        System.out.println("avg1 = " + avg1);
        System.out.println("avg2 = " + avg2);

        System.out.printf("java = %d, jsp = %d, spring = %d\n",java,jsp,spring);
        System.out.println("total = " + total);
        System.out.printf("평균: %.2f",avg2);
    }
}
