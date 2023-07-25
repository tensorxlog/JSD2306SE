package collection;

import java.util.*;

public class SortListDemo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });
        System.out.println(list);
    }
}
