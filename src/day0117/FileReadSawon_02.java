package day0117;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 사원,기본급,가족수,초과근무시간
 * 가족수 * 30_000
 * 초과근무시간 * 20_000
 */

public class FileReadSawon_02 {

    public static void fileReadSawon(){
        String filename = "C:\\sist0103\\sawon.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        int num=1;

        try {
            fileReader = new FileReader(filename);
            bufferedReader = new BufferedReader(fileReader);
            System.out.println();

            System.out.println("\t\t[사원급여]");
            System.out.println("번호\t\t사원명\t기본급\t가족수\t초과근무시간\t가족수당\t시간수당\t총급여합계");
            System.out.println("-------------------------------------------------------------------------------");


            int index = 0;
            while (true) {
                String s = bufferedReader.readLine();
                if (s == null) {
                    break;
                }
                index++;
                String[] split = s.split(",");
                String name = split[0];
                int sal = Integer.parseInt(split[1]);
                int family = Integer.parseInt(split[2]);
                int overWork = Integer.parseInt(split[3]);

                int famSal = family * 30_000;
                int overSal = overWork * 20_000;
                int total = sal + famSal + overSal;

                System.out.printf("%d\t\t%s\t\t%d\t\t%d\t\t%d\t\t%d\t%d\t%d\n",index,name,sal,family,overWork,famSal,overSal,total);

            }

        } catch (FileNotFoundException e) {
            System.out.println("e = " + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



    public static void main(String[] args) {
        fileReadSawon();
    }
}
