package reflect;

import java.util.Scanner;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Class cls = Class.forName("reflect.Person");
//        Object o = cls.newInstance();
//        System.out.println(o);
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Class cls = Class.forName(line);
        System.out.println(cls.newInstance());
    }
}
