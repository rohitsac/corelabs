// GettersSetters.java - getters and setters
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

class GettersSetters {
    public static void main(String[] args) {
        for (Method method : findGettersSetters(Person.class))
            System.out.println(method);
    }
    
    static ArrayList<Method> findGettersSetters(Class<?> c) {
        ArrayList<Method> list = new ArrayList<Method>();
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods)
            if (isGetter(method) || isSetter(method))
                list.add(method);
        return list;
    }

    public static boolean isGetter(Method method) {
        if (Modifier.isPublic(method.getModifiers()) &&
            !method.getReturnType().equals(void.class) &&
                method.getParameterTypes().length == 0 &&
                    method.getName().matches("^get[A-Z].*"))
                        return true;
        if (Modifier.isPublic(method.getModifiers()) &&
            method.getReturnType().equals(boolean.class) &&
                method.getParameterTypes().length == 0 &&
                    method.getName().matches("^is[A-Z].*"))
                        return true;
        return false;
    }

    public static boolean isSetter(Method method) {
        return Modifier.isPublic(method.getModifiers()) &&
            method.getReturnType().equals(void.class) &&
                method.getParameterTypes().length == 1 &&
                    method.getName().matches("^set[A-Z].*");
    }
}

/***********************************************

$ java GettersSetters
public java.lang.String Person.getName()
public void Person.setName(java.lang.String)
public int Person.getAge()
public void Person.setAge(int)
public boolean Person.isDeceased()
public void Person.setDeceased(boolean)
public boolean Person.isTeenager()

*/
