package HashTableTest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "사과");
        map1.put(2, "바나나");
        map1.put(3, "포도");

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("first", "사과");
        map2.put("second", "바나나");
        map2.put("third", "포도");

        System.out.println(map1.get(1));
        System.out.println(map2.get("first"));
    }
}
