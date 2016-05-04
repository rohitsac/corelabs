// InvokeMethods.java - invoke public void methods with signature
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

class MyThing {
    public void write(int i, String s) {
        System.out.format("write(int, String): %d %s\n", i, s);
    }
    public void print(String s, int i) {
        System.out.format("print(String, int): %s %d\n", s, i);
    }
    public void print(int i, String s) {
        System.out.format("print(int, String): %d %s\n", i, s);
    }
    public String read(int i, String s) {
        System.out.format("read(int, String): %d %s\n", i, s);
        return s;
    }
    public void setup() {
        System.out.format("setup()\n");
    }
}

public class InvokeMethods {
    public static void main(String[] args) {
        Object[] params = { 10, "data" };
        Class<?>[] ptypes = { int.class, String.class };
        try {
            MyThing obj = new MyThing();
            invokePublicVoidMethods(obj, params, ptypes);
            invokePublicVoidMethods(obj, null);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    static <T>
    void invokePublicVoidMethods(T obj, Object[] params, Class<?>... ptypes)
            throws InvocationTargetException, IllegalAccessException {
        Class<?> c = obj.getClass();
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            int mods = method.getModifiers();
            if (Modifier.isPublic(mods) &&
                method.getReturnType().equals(void.class) &&
                    Arrays.equals(method.getParameterTypes(), ptypes))
                        method.invoke(obj, params);
        }
    }
}

/******************************************************

$ java InvokeMethods
write(int, String): 10 data
print(int, String): 10 data
setup()

*/
