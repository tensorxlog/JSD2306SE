package object;

public class Demo {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);
        System.out.println(point.toString());
        System.out.println("test thsi object " + point);

        Point point2 = new Point(1, 2);
        System.out.println(point == point2);
        System.out.println(point.equals(point2));
    }
}


