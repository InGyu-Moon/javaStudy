package day0117;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileWrite_03 {

    public static void fileWrite(){

        String fileName = "C:\\sist0103\\test1.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName); // 파일 새로 생성 (같은 이름의 파일이 존재해도 새로 생성한다
            //파일에 내용추가
            fileWriter.write("Have a nice day~\n");
            fileWriter.write("오늘은 수요일 입니다.\n");
            fileWriter.write("toString(): " + new Date().toString());
            fileWriter.write("\n");
            fileWriter.write("String.valueOf: " + String.valueOf(new Date()));
            fileWriter.write("\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void fileWrite2(){
        FileWriter fileWriter = null;
        String fileName = "C:\\sist0103\\test1.txt";

        try {
            fileWriter = new FileWriter(fileName, true); //append가 true이면 추가
            fileWriter.write("=========================\n");
            fileWriter.write("파일이 추가되었습니다.\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }





    public static void main(String[] args) {
        fileWrite();
        fileWrite2();
    }
}
