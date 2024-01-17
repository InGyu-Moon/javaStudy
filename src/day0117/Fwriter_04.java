package day0117;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fwriter_04 {
    Scanner sc;
    FileWriter fileWriter;
    static final String FILE_NAME = "C:\\sist0103\\member.txt";

    public Fwriter_04() {
        sc = new Scanner(System.in);
    }
    public void dataWrite(){
        try {
            // 키보드로 이름,주소,핸드폰번호 입력후 파일에 저장
            fileWriter = new FileWriter(FILE_NAME,true);

            System.out.print("이름 입력: ");
            String name = sc.nextLine();

            System.out.print("주소 입력: ");
            String addr = sc.nextLine();

            System.out.print("연락처 입력: ");
            String ph = sc.nextLine();

            System.out.println("파일 저장!!");

            fileWriter.write("회원명: "+name+"\n");
            fileWriter.write("주소: "+addr+"\n");
            fileWriter.write("연락처: "+ph+"\n------------------------\n");
            fileWriter.flush();



        } catch (IOException e) {
            System.out.println("e = " + e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) {

        Fwriter_04 fwriter04 = new Fwriter_04();
        fwriter04.dataWrite();

    }
}
