package day0115;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet: 순서가 없다, 중복이 없다. 인덱스가 없다
// Set: 인터페이스, HashSet: 구현 클래스
// 인터페이스인 Set 으로 선언해서 사용하자
// <E> 제네릭: 타입을 명시, 해당 타입만 사용
public class HashSet_04 {
    public static void main(String[] args) {
        // 컬렉션은 가변적이다. 배열의 고정형을 보완해준다.

        Set<String> set1 = new HashSet<>();

        set1.add("사과");
        set1.add("바나나");
        set1.add("포도");
        set1.add("사과"); // Set은 중복 허용 X

        System.out.println("set1.size() = " + set1.size()); // 4가 아니라 3

        for (String str:set1){
            System.out.println("str = " + str);
        }

        Iterator<String> iter = set1.iterator();
        while (iter.hasNext()){
            System.out.println("iter.next() = " + iter.next());
        }

        Object[] array = set1.toArray();

    }
}
