package day0109;

import java.util.Scanner;

public class ArrDataInOut_12 {
    public static void main(String[] args) {
        // 배열 생성후 생성한 만큼 입력,출력
        Scanner sc = new Scanner(System.in);

        int [] data = new int[5];
        int sum=0;

        // 값 입력
        for(int i=0;i<data.length;i++){
            System.out.print((i+1)+"번쨰값: ");
            data[i] = sc.nextInt();
            sum+=data[i];
        }

        System.out.println("sum = " + sum);


    }
}
