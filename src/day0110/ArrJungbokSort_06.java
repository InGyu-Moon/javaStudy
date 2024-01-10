package day0110;

import java.util.Arrays;
import java.util.Random;

public class ArrJungbokSort_06 {
    public static void main(String[] args) {

        int [] lotto = new int[6];

        Random r = new Random();

        for(int i=0;i< lotto.length;i++){
            lotto[i] = r.nextInt(45) + 1;
            for(int j=0;j<i;j++){
                if(lotto[i]==lotto[j]){
                    i--;
                    break;
                }
            }
        }

        Arrays.sort(lotto);

        for(int l:lotto){
            System.out.print(l+"  ");
        }


    }
}
