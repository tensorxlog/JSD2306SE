package lambda;

import java.util.ArrayList;
import java.util.Collection;

public class LambdaDemo2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);

        c.forEach(s -> System.out.println(s));
        c.forEach(System.out::println);
    }
}
