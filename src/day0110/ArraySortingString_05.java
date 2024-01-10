package day0110;

public class ArraySortingString_05 {
    public static void main(String[] args) {
        String [] data = {"이승미","홍수아","김민선","강호동","전지현","송혜교","이효리"};

        System.out.println("**정렬전 출력**");
        for(String str:data){
            System.out.print(str+"  ");
        }
        System.out.println();

        for(int i=0;i< data.length-1;i++){
            for(int j=i;j< data.length;j++){
                if(data[i].compareTo(data[j])>0){
                    String temp;
                    temp = data[i];
                    data[i]=data[j];
                    data[j]=temp;
                }
            }
        }

        System.out.println("**정렬후 출력**");
        for(String str:data){
            System.out.print(str+"  ");
        }

    }
}
