package day0109;

public class StringEx_07 {
    public static void main(String[] args) {

        System.out.println("String 객체에 대한 맴버 메서드 익히기");

        String str1 = "apple";
        String str2 = "Apple";
        String str3 = "Have a Nice Day";
        String str4 = "   Today now   ";

        System.out.println("str3.length() = " + str3.length());
        System.out.println("str4.length() = " + str4.length());

        System.out.println("str4.trim().length() = " + str4.trim().length());
        System.out.println("*" + str4.trim() + "*");


    }
}
