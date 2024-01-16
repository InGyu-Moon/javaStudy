package day0116;

import java.util.Scanner;

// 강제 예외 발생 throw
class UserException extends Exception{
    public UserException(String msg) {
        super(msg); // Exception 클래스 생성자를 통해 정식 메시지로 등록
    }
}

public class ThrowException_03 {
    public static void process() throws UserException{
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = Integer.parseInt(sc.nextLine());
        if(age>59 || age < 10)
            throw new UserException("나이는 10~59사이 입니다");
        else
            System.out.println("당신의 나이는 "+age+"살 이므로 등록 가능합니다");
    }

    public static void main(String[] args) {
        try {
            process();
        }
        catch (UserException e){
            System.out.println("e = " + e);
        }
        System.out.println("정상종료");

    }

}
