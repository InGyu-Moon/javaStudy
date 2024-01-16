package day0116;

public class ExceptionReview_01 {
    public static void main(String[] args) {

        System.out.println("안녕하세요..");
        System.out.println("3초후에 저는 갑니다");
        try {
            for(int i=2;i>=0;i--){
                System.out.println((i+1));
                Thread.sleep(1_000);
            }

        } catch (InterruptedException e) {
            System.out.println("e = " + e);
        }
        System.out.println("***잘가***");

    }
}
