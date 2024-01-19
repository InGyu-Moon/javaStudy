package _etc;

import java.util.HashMap;
import java.util.Map;

public class Example{
    public static void main(String[] args) {

        Test test = new Test();

        int num=1;
        test.add1(num);

        Map<String, Object> model = new HashMap<>();
        test.add2(model);

        System.out.println("num = " + num);
        System.out.println("model = " + model);

    }
}
class Test{
    public void add1(int num){
        num = 10;
    }
    public void add2(Map<String, Object> model) {
        model.put("key1", "value1");
        model.put("key2", "value2");
    }

}