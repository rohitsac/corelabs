// ParameterizedSuperClass.java - Parameterized superclass
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;

class ZipMap extends HashMap<String, Integer> {
    public ZipMap() { }
    public ZipMap(String name, int zipCode) {
        put(name, zipCode);
    }
    public Integer getZipCode(String name) {
        return get(name);
    }
    public void setZipCode(String name, int zipCode) {
        put(name, zipCode);
    }
}

public class ParameterizedSuperClass {
    public static void main(String[] args) {
        showParameterizedSuperClass(ZipMap.class);
    }
    
    static void showParameterizedSuperClass(Class<?> c) {
        System.out.format("%s\n", c.getName());
        Type superType = c.getGenericSuperclass();

        if (superType instanceof ParameterizedType) {
            ParameterizedType ptype = (ParameterizedType)superType;
            System.out.format("  Superclass Raw Type: %s\n", ptype.getRawType());
            
            Type[] ptypes = ptype.getActualTypeArguments();
            System.out.format("  Actual Type Arguments: ");
            for (Type pt : ptypes)
                System.out.format("<%s> ", pt);
            System.out.println();
        }
    }
}

/************************************************

$ java ParameterizedSuperClass
ZipMap
  Superclass Raw Type: class java.util.HashMap
  Actual Type Arguments: <class java.lang.String> <class java.lang.Integer>

*/