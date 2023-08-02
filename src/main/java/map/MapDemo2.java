package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("语文", 90);
        map.put("英语", 86);
        map.put("数学", 93);
        map.put("物理", 90);

        Set<String> keySet = map.keySet();
        for (String key: keySet) {
            System.out.println(key);
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry: entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ", " + value);
        }

        Collection<Integer> values = map.values();
        for (Integer value: values) {
            System.out.println(value);
        }

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
