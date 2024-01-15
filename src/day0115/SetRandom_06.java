package day0115;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetRandom_06 {
    public static void main(String[] args) {

        Random r = new Random();

        Set<Integer> set = new HashSet<>();
        while (true){
            set.add(r.nextInt(45)+1);
            if(set.size()==6)
                break;;
        }

        for (int n:set){
            System.out.println("n = " + n);
        }

    }
}
