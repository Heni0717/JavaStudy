package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        // Map : key - value
        //  -> key 값으로 unique하게 보장되어야 함
        //  -> HashMap, TreeMap으로 응용

        Map<String, Integer> intMap = new HashMap<>();
        intMap.put("일",1);
        intMap.put("이",2);
        intMap.put("삼",3);  // key값이 중복되므로 다음 요소에 의해 덮어짐
        intMap.put("삼",4);  // -> 요녀석이 출력

        for(String key:intMap.keySet()){
            System.out.println(key);
        }
        for(Integer val:intMap.values()){
            System.out.println(val);
        }

        // key값으로 value 추출
        System.out.println(intMap.get("삼"));

    }
}
