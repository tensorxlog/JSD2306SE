package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("语文", 90);
        map.put("英语", 86);
        map.put("数学", 93);
        map.put("物理", 90);
        map.put(null, 90);
        map.put("test", null);
        System.out.println(map);
        System.out.println(map.put("语文", 100));
        System.out.println(map.size());
        System.out.println(map.get("test"));
        System.out.println(map.get("hello"));
        System.out.println(map.remove("hello"));
        System.out.println(map.containsKey("物理"));
        System.out.println(map.containsValue("30"));
        System.out.println(map.containsKey(null));
        System.out.println(map.containsValue(null));
    }
}
