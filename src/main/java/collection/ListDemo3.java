package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        List<Integer> sub = list.subList(3, 8);
        System.out.println(sub);

        for (int i = 0; i < sub.size(); i++) {
            sub.set(i, 10 * sub.get(i));
        }
        System.out.println(sub);
        System.out.println(list);

        List<Integer> temp = list.subList(2, 9);
        temp.clear();
        System.out.println(list);
    }
}
