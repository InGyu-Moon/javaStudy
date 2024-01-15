package day0115;

public class DirverExep_14 {
    public static void main(String[] args) {

        try {
            Class aClass = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println("e = " + e);
        } finally {
            System.out.println("프로그램 정상종료");
        }


    }
}
