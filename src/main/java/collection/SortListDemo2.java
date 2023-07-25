package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(230, 200));
        list.add(new Point(200, 100));
        list.add(new Point(20, 10));
        list.add(new Point(100, 50));

        Collections.sort(list, new Comparator<Point>() {
            public int compare(Point p1, Point p2) {
                int dist1 = p1.getX() * p1.getX() + p1.getY() * p1.getY();
                int dist2 = p2.getX() * p2.getX() + p2.getY() * p2.getY();
                return dist1 - dist2;
            }
        });
        System.out.println(list);

    }
}
