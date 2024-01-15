package day0115;


import java.util.HashMap;
import java.util.Map;

public class MapEx_11 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("name", "강호동");
        map.put("age","33");
        map.put("name", "수지");

        System.out.println("개수: " + map.size());
        System.out.println("이름: "+map.get("name"));
        System.out.println("나이: "+map.get("age"));






    }
}
