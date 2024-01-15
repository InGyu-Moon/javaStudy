package day0115;

// Stream: 바이트 단위로 처리
// writer, reader: 대부분 문자단위로 처리
// BufferReader: 해당 클래스는 스트림으로 부터 데이터를 읽어올때, 한줄씩 읽을수 있는 readLine()
// BufferWriter: flush() 메소드를 호출해서 버퍼의 내용을 전송하는 작업이 추가로 필요함

import java.io.IOException;
import java.io.InputStream;

public class IOExcep_16 {
    public static void main(String[] args) {

        InputStream is = System.in; // 콘솔에서 입력을 받기위한 스트림

        System.out.print("한글자 입력: ");
        int a = 0;
        try {
            a = is.read(); // 1바이트 읽음, return 타입이 int 죽 아스키코드값, 한글은 못읽는다 (한글은 2바이트)
        } catch (IOException e) {
            System.out.println("e = " + e);
        }

        System.out.println("3초 뒤에 출력합니다.");

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            System.out.println("e = " + e);
        }
        System.out.println("입력값: "+(char)a);

    }
}
