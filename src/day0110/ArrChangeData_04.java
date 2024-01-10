package day0110;

public class ArrChangeData_04 {
    public static void main(String[] args) {
        int [] arr = {4,8,9,12,78,98,23,22,5,2};
        System.out.println("**원 데이터**");
        for (int j : arr) {
            System.out.print(j + "  ");
        }
        System.out.println();

        System.out.println("**거꾸로 변경하기**");
        for(int i=0;i<arr.length/2;i++){
            int temp;
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

        for (int j : arr) {
            System.out.print(j + "  ");
        }

        System.out.println();
        System.out.println("**오름차순 정렬**");
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp;
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        for (int j : arr) {
            System.out.print(j + "  ");
        }



    }
}
