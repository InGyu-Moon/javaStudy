package day0105;

import java.util.Scanner;

public class OperTest_04 {
    public static void main(String[] args) {
        // 두수를 입력해서 산술연산자를 이용해서 출력

        int a,b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("두수를 입력해주세요");
        a = Integer.parseInt(scanner.nextLine());
        b = Integer.parseInt(scanner.nextLine());

        System.out.println("[산술연산자결과]");
        System.out.println("더하기: "+(a+b));
        System.out.println("뺴기: "+(a-b));
        System.out.println("곱하기: "+(a*b));
        System.out.println("나누기: "+(a/b));
        System.out.println("나머지값: "+(a%b));




    }
}
