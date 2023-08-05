package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class cls = Class.forName("reflect.Person");
        Method[] methods = cls.getMethods();
        Object obj = cls.newInstance();
        for (Method method: methods) {
            if (method.getModifiers() == Modifier.PUBLIC && method.getParameterCount() == 0) {
                method.invoke(obj);
            }
        }
    }
}
