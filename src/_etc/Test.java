package _etc;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {

        //String str1 = "Hello";
        //String str2 = "Hello";

        //System.out.println(str1==str2);
        //System.out.println(str1.equals(str2));


        String str1 = "Hello";
        str1 += "Java";

        String str2 = new String("Hello");

        Vector<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();

        List<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ((ArrayList<Integer>) l1).trimToSize();
        l2.trimToSize();


    }
}
