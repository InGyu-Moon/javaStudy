package day0115;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorBoard_09 {

    List<Board_09> list = new Vector<>();

    //제네릭 유형을 클래스로 지정했으므로 데이터를 꺼내고 받을때 클래스



    // 입력메서드
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("writer: ");
        String writer = sc.nextLine();
        System.out.print("subject: ");
        String subject = sc.nextLine();
        System.out.print("content: ");
        String content = sc.nextLine();
        list.add(new Board_09(writer,subject,content));

    }

    //출력
    public void writeData(){
        System.out.println("데이터 목록");
        System.out.println("===========================");
        for (int i=0;i<list.size();i++){
            Board_09 board = list.get(i);
            System.out.println("board.getWriter() = " + board.getWriter());
            System.out.println("board.getSubject() = " + board.getSubject());
            System.out.println("board.getContent() = " + board.getContent());
            System.out.println("----------------------------------");
        }
    }



    public static void main(String[] args) {
        VectorBoard_09 vb = new VectorBoard_09();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("입력: 1   출력: 2   종료: 9");
            int n = Integer.parseInt(sc.nextLine());
            if(n==1){
                vb.inputData();
            } else if (n==2) {
                vb.writeData();
            } else if (n==9) {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
