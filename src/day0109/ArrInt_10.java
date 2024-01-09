package day0109;

public class ArrInt_10 {
    public static void main(String[] args) {
        // 배열 선언과 동시에 초기값 지정할수있다.

        int [] arr={1,2,3,4,5};

        System.out.println(arr.length);

        for(int a:arr){
            System.out.print(a+"  ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }


    }
}
