package day0116;

abstract class AbstObj{
    abstract public void dataIn();
    abstract public void dataOut();
}
class SubAbst extends AbstObj{
    @Override
    public void dataIn() {
        System.out.println("extend data in");
    }

    @Override
    public void dataOut() {
        System.out.println("extend data out");
    }
}
public class Anonymous_09 {
    AbstObj ab1 = new AbstObj() {
        @Override
        public void dataIn() {
            System.out.println("익명 내부 클래스_데이타 출력");
        }

        @Override
        public void dataOut() {
            System.out.println("익명 내부 클래스_데이터 입력");
        }
    };

    public static void main(String[] args) {

        Anonymous_09 anonymous09 = new Anonymous_09();
        anonymous09.ab1.dataIn();
        anonymous09.ab1.dataOut();

        AbstObj abstObj = new SubAbst();
        abstObj.dataIn();
        abstObj.dataOut();

    }
}
