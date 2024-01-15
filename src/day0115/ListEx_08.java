package day0115;

import javax.swing.plaf.ListUI;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListEx_08 {
    public static void write(String title, List<String> list){
        System.out.println("**"+title+"**");
        for(int i=0;i<list.size();i++){
            System.out.println(i+": "+list.get(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /**
         * Vector, ArrayList 순차, 중복데이터 가능
         * 메서드
         * get(index): 지정된 위치 값 요소를 리턴함
         * toArray(): 리스트내의 모든 요소를 순서대로 포함하고 배열에 넣어준다.
         * isEmpty():
         */

        String[] data = {"햄버거", "피자", "파스타"};

        // 배열의 데이터를 리스트에 넣기
        List<String> list = new Vector<>();

        for (String s: data){
            list.add(s);
        }

        write("초기 배열 데이터",list);

        System.out.println("1번 인덱스 삭제해보기");
        list.remove(1);
        write("삭제후 결과",list);

        System.out.println("리코타샐러드 추가하기");
        list.add("리코타샐러드");
        write("추가후 결과",list);

        System.out.println("1번 인덱스를 스파게티로 변경");
        //list.set(1, "스파게티");
        list.set(list.indexOf("파스타"), "스파게티");
        write("변경후 출력",list);

        System.out.println("전체 삭제");
        list.clear();
        System.out.println("list.size() = " + list.size());

    }
}
