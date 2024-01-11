package day0111;

/**
 * 메서드 접근제한자 + 지정 예약어 + 결과형 리턴값 + 메서드명 ()
 * 장점: 반복적인 코드를 줄인다
 * 하나의 메서드는 한가지 기능만 수행하도록 작성
 *
 */


public class ExMethod_13 {

    public static boolean aaa(){
        return false;
    }

    public static int bbb(){
        return 11;
    }



    public static void main(String[] args) {

        boolean a=aaa();
        System.out.println("a = " + a);

        int b = bbb();
        System.out.println("b = " + b);




    }
}
