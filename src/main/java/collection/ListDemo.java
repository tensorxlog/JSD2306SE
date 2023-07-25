package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        String old = list.set(2, "A");
        System.out.println(old);
        System.out.println(list);

        int n = list.size();
        for (int i = 0; i < n/2; i++) {

            String s1 = list.get(i);
            String s2 = list.get(n - 1 - i);
            list.set(i, s2);
            list.set(n - 1 - i, s1);
        }
        System.out.println(list);
    }
}
