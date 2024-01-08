package day0108;

public class SumTest_11 {
    public static void main(String[] args) {

        System.out.println("for 문으로 1~10까지중 2씩 증가할 경우의 합계를 구하시오");

        int sum=0;
        for(int i=1;i<=10;i+=2){
            sum+=i;
        }
        System.out.println("sum = " + sum);

    }
}
