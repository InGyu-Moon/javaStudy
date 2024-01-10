package day0110;

public class ArraysChange_03 {
    public static void main(String[] args) {

        // 순서 바꾸기 연습

        int a=10,b=20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();

        int [] n = {5,8,4};
        for(int t:n){
            System.out.print(t+"  ");
        }

        System.out.println();
        System.out.println("0번과 2번을 교환후 출력");

        int temp2 = n[0];
        n[0]=n[2];
        n[2]=temp2;

        for(int t:n){
            System.out.print(t+"  ");
        }




    }
}
