package day0115;

import java.util.List;
import java.util.Vector;

public class ListEx_07 {
    public static void main(String[] args) {
        // 1.순차적으로 데이터가 들어간다.
        // 2. 중복 허용
        // 3. 처음 생성시 일정한 개수로 생성, 그이상 넣으면 자동으로 공간이 늘어난다.

        //List<String> vec = new Vector<>();
        Vector<String> vec = new Vector<>();
        System.out.println("초기 데이터 개수: "+vec.size());
        System.out.println("초기 할당 크기: "+vec.capacity());

        for(int i=0;i<5;i++){
            vec.add("장미");
        }

        Object[] ob = vec.toArray();

    }
}
