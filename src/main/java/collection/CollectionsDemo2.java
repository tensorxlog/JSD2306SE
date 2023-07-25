package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("1");
        collection.add("2");
        collection.add("3");

        Collection c = new ArrayList();
        c.add("test1");
        c.add("test2");
        c.add("test3");
        c.add("test4");
        c.add("test5");

        collection.addAll(c);

        System.out.println(collection);
        System.out.println(c);

        Collection testColl = new ArrayList();
        testColl.add("test1");
        testColl.add("sfsf");
        System.out.println(c.containsAll(testColl));

        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("c");

        c1.removeAll(c2);
        System.out.println(c1);

        Iterator it = c1.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }

    }
}
