package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList<String>();
        c.add("a");
        c.add("b");
        c.add("c");
        System.out.println(c);
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.clear();
        System.out.println(c.size());
        System.out.println(c.isEmpty());

        Collection cc = new ArrayList<Point>();
        cc.add(new Point(1, 2));
        cc.add(new Point(2, 3));
        System.out.println(cc);

        System.out.println(cc.contains(new Point(1, 2)));
        cc.remove(new Point(1, 2));
        System.out.println(cc);

        Collection cset = new HashSet();
        cset.add(new Point(1, 2));
        cset.add(new Point(2, 5));
        cset.add(new Point(3, 4));
        cset.add(new Point(1, 2));
        System.out.println(cset);

    }
}
