package day0116;

abstract class AbEx{
    abstract public void dataAdd();
    abstract public void dataList();
}

public class Anonymous_08 {

    AbEx abEx = new AbEx() {
        @Override
        public void dataAdd() {
            System.out.println("데이터 추가");
        }

        @Override
        public void dataList() {
            System.out.println("데이터 입력");
        }
    };

    public static void main(String[] args) {
        Anonymous_08 anonymous08 =  new Anonymous_08();
        anonymous08.abEx.dataAdd();
        anonymous08.abEx.dataList();

    }



}
