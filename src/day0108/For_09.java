package day0108;

public class For_09 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.print(i+"   ");
        }

        System.out.println();

        for(int i=10;i>=1;i--){
            System.out.print(i+"   ");
        }

        System.out.println();

        for(int i=1;i<=10;i++){
            if(i%2==1)
                continue;
            System.out.print(i+"   ");
        }


    }
}
