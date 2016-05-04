// ParameterizedInterfaces.java - Parameterized interfaces
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;

interface Swap {
    void swap();
}

class ZipMap extends HashMap<String, Integer> 
                implements Comparable<Integer>, Swap {
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
    public int compareTo(Integer zipCode) {
        return containsValue(zipCode) ? 0 : 1;
    }
    public void swap() { }
}

public class ParameterizedInterfaces {
    public static void main(String[] args) {
        showParameterizedInterfaces(ZipMap.class);
    }

    static void showParameterizedInterfaces(Class<?> c) {
        System.out.format("%s\n", c.getName());
        Type[] interfaces = c.getGenericInterfaces();

        for (Type type : interfaces)
            if (type instanceof ParameterizedType) {
                ParameterizedType ptype = (ParameterizedType)type;
                System.out.format("  Interface Raw Type: %s\n", ptype.getRawType());
                
                Type[] ptypes = ptype.getActualTypeArguments();
                System.out.format("  Actual Type Arguments: ");
                for (Type pt : ptypes)
                    System.out.format("<%s> ", pt);
                System.out.println();
            }
    }
}

/************************************************

$ java ParameterizedInterfaces
ZipMap
  Interface Raw Type: interface java.lang.Comparable
  Actual Type Arguments: <class java.lang.Integer> 

*/