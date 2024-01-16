package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// BufferReader: 버퍼를 사용해서 파일읽기
// FileReader: 경로에 있는 파일을 로드 해준다. 반드시 Exception이 발생한다.
public class FileException_11 {


    public static void read(){
        String fileName = "C:\\sist0103\\memo.txt";
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(fileName);
            System.out.println("open file!!");
            br = new BufferedReader(fr);

            while (true){
                String s = br.readLine();
                // 마지막줄의 경우 null값을 읽는다, null값일경우 while문을 나온다.
                if (s == null) {
                    break;
                }
                System.out.println(s);
            }


        } catch (FileNotFoundException e) { // fr = new FileReader(fileName);
            System.out.println("e = " + e);

        } catch (IOException e){            // String s = br.readLine();
            System.out.println("e = " + e);
        }finally {
            try {
                // close 할때는 생성한 반대로 해준다.
                br.close();
                fr.close();
                System.out.println("close 완료");
            } catch (IOException e) {
                System.out.println("e = " + e);
            }
        }
    }

    public static void main(String[] args) {
        read();
    }
}
