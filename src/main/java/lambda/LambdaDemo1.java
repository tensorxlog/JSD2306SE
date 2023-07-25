package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("saklfj");
        list.add("skdslf");
        list.add("kjsdf");
        Collections.sort(list, (s1, s2) -> s1.length() - s2.length());

        System.out.println(list);
    }
}
