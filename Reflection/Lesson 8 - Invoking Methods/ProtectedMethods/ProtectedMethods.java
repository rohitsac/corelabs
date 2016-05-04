// ProtectedMethods.java - invoke protected void methods with signature
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

class Thing {
    protected void write(int i, String s) {
        System.out.format("Thing.write(int, String): %d %s\n", i, s);
    }
    public void print(String s, int i) {
        System.out.format("Thing.write(String, int): %s %d\n", s, i);
    }
    protected void print(int i, String s) {
        System.out.format("Thing.print(int, String): %d %s\n", i, s);
    }
    public String read(int i, String s) {
        System.out.format("Thing.read(String s): %s %d\n", s, i);
        return s;
    } 
}

class MyThing extends Thing {
    protected void compute(int i, String s) {
        System.out.format("MyThing.compute(int, String): %d %s\n", i, s);
    }
}

public class ProtectedMethods {
    public static void main(String[] args) {
        Object[] params = { 10, "data" };
        Class<?>[] ptypes = { int.class, String.class };
        try {
            MyThing obj = new MyThing();
            invokeProtectedVoidMethods(obj, Thing.class, params, ptypes);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    static <T> 
    void invokeProtectedVoidMethods(T obj, Class<?> superClass, 
            Object[] params, Class<?>... ptypes)
                throws InvocationTargetException, IllegalAccessException {
        Method[] methods = getProtectedMethods(obj.getClass(), superClass);
        for (Method method : methods) {
            if (method.getReturnType().equals(void.class) &&
                Arrays.equals(method.getParameterTypes(), ptypes)) {
                    method.setAccessible(true);
                    method.invoke(obj, params);
                    //System.out.println(method);
            }
        }
    }
    
    static Method[] getProtectedMethods(Class<?> thisClass, Class<?> superClass) {
        ArrayList<Method> list = new ArrayList<Method>();
        for (;; thisClass = thisClass.getSuperclass()) {
            Method[] methods = thisClass.getDeclaredMethods();
            for (Method method : methods)
                if (Modifier.isProtected(method.getModifiers()))
                    list.add(method);
            if (thisClass == superClass) break;
        }
        return list.toArray(new Method[list.size()]);
    }
}

/******************************************************

$ java ProtectedMethods
MyThing.compute(int, String): 10 data
Thing.write(int, String): 10 data
Thing.print(int, String): 10 data

*/
