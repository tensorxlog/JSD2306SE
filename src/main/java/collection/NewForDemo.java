package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NewForDemo {
    public static void main(String[] args) {
        String arr[] = {"a", "b", "c"};
        for (String s: arr) {
            System.out.println(s);
        }

        Collection<String> c = new ArrayList<>();
        c.add("a");
        c.add("b");
        c.add("c");
        for (String s: c) {
            System.out.println(s);
        }

        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
