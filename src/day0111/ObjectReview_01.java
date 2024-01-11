package day0111;
// 객체의 속성: 인스턴스 변수      객체의 동작: 클래스의 메서드
// Object: 객체, 실제로 존재하는 사물
// Class: 객체의 정의, 객체를 생성하기 위해 존재(설계도...)
// Instance: 클래스에서 만들어진 객체를 해당 클래스의 인스턴스라고한다.

class Person{
    private String name;
    private int age;
    private String hp;
    private String addr;

    public Person() {
    }

    public Person(String name, int age, String hp, String addr) {
        this.name = name;
        this.age = age;
        this.hp = hp;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

public class ObjectReview_01 {

    public static void main(String[] args) {

        Person p1 = new Person();
        // p1.name="홍길동";
        p1.setName("홍길동");
        p1.setAddr("강남구");
        p1.setAge(22);
        p1.setHp("010-1234-1234");

        System.out.println("p1.getName() = " + p1.getName());

        Person p2 = new Person("김소미",22,"서울시","010-1234-1234");
        System.out.println("p2.getName() = " + p2.getName());




    }
}
