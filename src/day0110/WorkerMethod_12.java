package day0110;

class Info{
    private String name;
    private int age;

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
}


public class WorkerMethod_12 {

    public static void main(String[] args) {
        Info in1 = new Info();
        // 인스턴스 변수에 private이 붙으면 변수 접근이 안된다.
        //in1.name="홍길동";
        //in1.age=33;
    }
}
