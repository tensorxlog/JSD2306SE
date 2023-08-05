package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo7 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        Method method = cls.getDeclaredMethod("test");
        method.setAccessible(true);
        method.invoke(obj);
        method.setAccessible(false);
    }
}
