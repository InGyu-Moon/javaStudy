package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class QuizFileException_15 {
    public static void fileRead() {
        String fileName = "C:\\sist0103\\fruitshop.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            System.out.println("**과일입고목록**");
            System.out.println();
            System.out.println("번호\t\t과일명\t\t수량\t\t단가\t\t총금액");
            System.out.println("----------------------------------------------");

            int cnt =1;
            while (true) {
                String s = br.readLine();
                if (s == null) {
                    break;
                }
                String[] split = s.split(",");

                int productNum = Integer.parseInt(split[1]);
                int price = Integer.parseInt(split[2]);
                int total = productNum * price;

                System.out.printf("  %d\t\t%s\t\t%d\t\t%d\t%d원\n",cnt,split[0],productNum,price,total);
                cnt++;
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




