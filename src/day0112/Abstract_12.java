package day0112;

import java.util.Scanner;

// 추상클래스, 부모클래스
abstract class Board{
    public abstract void play();
}

class Insert extends Board{
    @Override
    public void play() {
        System.out.println("Insert");
    }
}
class Select extends Board{
    @Override
    public void play() {
        System.out.println("Select");
    }
}
class Update extends Board{
    @Override
    public void play() {
        System.out.println("Update");
    }
}
class Delete extends Board{
    @Override
    public void play() {
        System.out.println("Delete");
    }
}


public class Abstract_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Board board = null;

        while (true){
            System.out.println("1.쓰기 2.조회 3.수정 4.삭제 (그외 숫자 종료)");
            int input = Integer.parseInt(sc.nextLine());
            switch (input){
                case 1:
                    board = new Insert();
                    break;
                case 2:
                    board = new Select();
                    break;
                case 3:
                    board = new Update();
                    break;
                case 4:
                    board = new Delete();
                    break;
                default:
                    System.out.println("종료합니다.");
                    System.exit(0);
            }
            board.play();

        }



















    }
}
