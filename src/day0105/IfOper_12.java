package day0105;

import java.util.Scanner;

public class IfOper_12 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 형식 조건식 ? 참일때 : 거짓일때

        Scanner sc = new Scanner(System.in);

        int max;

        System.out.println("**두개의 숫자를 입력하세요**");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("입력한 두 수는 "+x+","+y);
/*
        if(x>y){
            max=x;
        }
        else{
            max=y;
        }
*/
        max = x>y?x:y;

        System.out.println("두수중에서 더 큰값은 "+max+"입니다.");

    }
}
