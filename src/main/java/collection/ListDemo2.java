package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        list.add(2, "inserted");
        System.out.println(list);

        String removed = list.remove(2);
        System.out.println(removed);
        System.out.println(list);
    }
}
