package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("a");
        c.add("#");
        c.add("b");
        c.add("#");
        c.add("c");

        Iterator it = c.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
            if ("#".equals(s)) {
                it.remove();
            }
        }

        System.out.println(c);
    }
}
