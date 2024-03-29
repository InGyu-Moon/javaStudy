package day0110;

// static 변수는 메모리에 한번 할당되면 프로그램이 종료될때 해제되는 변수
// 메모리에 한번 할당이므로 여러객체가 해당 메모리를 공유 -> 효율이 좋아진다.(조회수증가 -> static)
public class StaticInstance_09 {
    static int count =0;

    public StaticInstance_09() {
        count++;
        System.out.println("count = " + count);
    }

    public static void main(String[] args) {

        //객체 변수는 항상 독립적이므로 count는 서로다른 메모리를 가지므로 증가하지 안흔다.
        // static은 공유하므로 증가한다.
        StaticInstance_09 s1 = new StaticInstance_09();
        StaticInstance_09 s2 = new StaticInstance_09();

    }
}
