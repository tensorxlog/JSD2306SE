package map;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String line = "i love java, thinking in java! hello world!";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}
