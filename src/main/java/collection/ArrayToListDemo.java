package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four", "five"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
        list.set(1, "test");
        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        List<String> list1 = new ArrayList<>(list);
        list1.add("test");
        System.out.println(list1);
    }

}
