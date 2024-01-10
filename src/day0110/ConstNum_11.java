package day0110;

class Num{
    int num;

    public Num() {
        System.out.println("디폴트 생성자 호출");
    }

    //인자가 있는 생성자
    public Num(int num) {
        this.num = num;
        System.out.println("인자있는 생성자 호출");
    }

    public int getNumber(){
        num=50;
        return num;
    }



}
//=======================================================//

public class ConstNum_11 {
    public static void main(String[] args) {
        Num n1 = new Num();

        Num n2 = new Num(30);
        System.out.println("n2.num = " + n2.num);

        Num n3 = new Num();
        System.out.println("n3.getNumber() = " + n3.getNumber());

    }
}

