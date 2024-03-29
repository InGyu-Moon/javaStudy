package day0105;

public class OperTest_03 {
    public static void main(String[] args) {
        // 증감연산자 ++, --

        int a,b;
        a=b=5;

        // 단항일 경우에는 증감연산자를 앞에 붙히나 뒤에 붙히나 같다
        ++a;
        b++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 수식에서는 전치,후치가 결과값이 다르다.
        int m,n;
        m=n=0;
        a=b=5;

        m=a++;
        System.out.println("m = " + m);
        System.out.println("a = " + a);

        n=++b;
        System.out.println("n = " + n);
        System.out.println("b = " + b);
    }
}
