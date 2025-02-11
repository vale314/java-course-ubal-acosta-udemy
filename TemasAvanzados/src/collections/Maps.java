package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        // No ordena y no permite duplicados

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
