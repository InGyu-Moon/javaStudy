package day0105;

import java.util.Scanner;

public class Equal_15 {
    public static void main(String[] args) {
        //문자열 비교는 관계연산자로 이용 안되고
        // equals()라는 메서드를 이용해서 비교합니다.

        Scanner sc = new Scanner(System.in);

        System.out.println("영어 단어를 입력해보세요");
        System.out.println("ex) happy, rose, dragon, angel, music");

        String word = sc.nextLine();

        System.out.println("입력한 단어: "+word);

        // https://velog.io/@wngus4278/heap-memory


    }
}
