package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("时刻提防");
        list.add("来了");
        list.add("水立方");
        //Collections.sort(list);
        //System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        System.out.println(list);

    }
}
