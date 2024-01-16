package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileException_12 {

    // 점수의 총개수, 합계, 평균
    public static void scoreRead() throws FileNotFoundException, IOException{
        String fileName = "C:\\sist0103\\memo.txt";
        BufferedReader br = null;
        FileReader fr = null;
        int cnt=0; // 개수
        int total=0; // 합계
        double avg=0; // 평균

        // 파일 읽기
        fr = new FileReader(fileName);
        System.out.println("read file");

        br = new BufferedReader(fr);
        while (true) {
            String s = br.readLine();

            if (s == null) {
                break;
            }
            
            int num = Integer.parseInt(s);
            cnt++;
            total += num;
            avg = (double) total / cnt;

            System.out.println("num = " + cnt);
            System.out.println("total = " + total);
            System.out.printf("avg = %.2f\n", avg);

            br.close();
            fr.close();
        }
    }

    public static void main(String[] args)  {
        try {
            scoreRead();
        } catch (IOException e) {
            System.out.println("e = " + e);
        }finally {

        }
    }
}
