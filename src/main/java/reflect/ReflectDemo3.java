package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class cls = Class.forName("reflect.Person");
        Constructor constructor = cls.getConstructor(String.class, int.class);
        Object o = constructor.newInstance("test", 20);
        System.out.println(o);
    }
}
