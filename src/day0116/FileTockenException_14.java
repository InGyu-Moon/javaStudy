package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileTockenException_14 {

    public static void fileRead(){
        String fileName = "C:\\sist0103\\memo.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            System.out.println("**file read result**");
            System.out.println("이름\t주소\t나이\t");
            System.out.println("========================");
            while (true) {
                String s = br.readLine();
                if (s == null) {
                    break;
                }
                // split으로 분리
                /*
                String[] split = s.split(",");
                System.out.printf("%s\t%s\t%s\n",split[0],split[1],split[2]);
                 */

                // StringTokenizer 이용해서 분리
                StringTokenizer st = new StringTokenizer(s, ",");
                System.out.println(st.nextToken() + "\t" + st.nextToken() + "\t" + st.nextToken());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        fileRead();
    }
}
