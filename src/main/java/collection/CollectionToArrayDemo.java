package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        String[] arr = c.toArray(new String[5]);
        System.out.println(Arrays.toString(arr));

        String[] arr1 = c.toArray(new String[3]);
        System.out.println(Arrays.toString(arr1));
    }
}
