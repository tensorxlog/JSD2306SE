package reflect;

import java.lang.reflect.InvocationTargetException;

public class ReflectDemo5 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        cls.getMethod("say", String.class).invoke(obj, "hahaha");
        cls.getMethod("say", String.class, int.class).invoke(obj, "skdfjskf", 20);
    }
}
