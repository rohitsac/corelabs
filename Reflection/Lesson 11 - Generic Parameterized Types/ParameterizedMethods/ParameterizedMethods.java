// ParameterizedMethods.java - Parameterized methods
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

class MethodParams {
   public void print() { }
   private void write(ArrayList<String> list) { }
   public void debug(Map<String, Integer> map, char c) { }
}

class MethodReturns {
    public void print() { }
    private ArrayList<String> list;
    private Map<String, Integer> map;
    private Map<String, Integer> getMap() { return map; }
    public ArrayList<String> getList() { return list; }
}

public class ParameterizedMethods {
    public static void main(String[] args) {
        showParameterizedMethodParameters(MethodParams.class);
        showParameterizedMethodReturnTypes(MethodReturns.class);
    }
    
    static void showParameterizedMethodParameters(Class<?> c) {
        System.out.format("%s\n", c.getName());
        Method[] methods = c.getDeclaredMethods();

        for (Method method : methods) {
            Type[] types = method.getGenericParameterTypes();
            for (Type type : types)
                if (type instanceof ParameterizedType) {
                    ParameterizedType ptype = (ParameterizedType)type;
                    System.out.format("  Method %s Parameter Raw Type: %s\n",
                            method.getName(), ptype.getRawType());
                    
                    Type[] ptypes = ptype.getActualTypeArguments();
                    System.out.format("  Actual Type Arguments: ");
                    for (Type pt : ptypes)
                        System.out.format("<%s> ", pt);
                    System.out.println();
                }
        }
    }
   
    static void showParameterizedMethodReturnTypes(Class<?> c) {
       System.out.format("%s\n", c.getName());
        Method[] methods = c.getDeclaredMethods();

        for (Method method : methods) {
            Type type = method.getGenericReturnType();
            if (type instanceof ParameterizedType) {
                ParameterizedType ptype = (ParameterizedType)type;
                System.out.format("  Method %s Return Raw Type: %s\n",
                            method.getName(), ptype.getRawType());
                
                Type[] ptypes = ptype.getActualTypeArguments();
                System.out.format("  Actual Type Arguments: ");
                for (Type pt : ptypes)
                    System.out.format("<%s> ", pt);
                System.out.println();
             }
        }
    }
}

/********************************************************

$ java ParameterizedMethods
MethodParams
  Method write Parameter Raw Type: class java.util.ArrayList
  Actual Type Arguments: <class java.lang.String>
  Method debug Parameter Raw Type: interface java.util.Map
  Actual Type Arguments: <class java.lang.String> <class java.lang.Integer>
MethodReturns
  Method getMap Return Raw Type: interface java.util.Map
  Actual Type Arguments: <class java.lang.String> <class java.lang.Integer>
  Method getList Return Raw Type: class java.util.ArrayList
  Actual Type Arguments: <class java.lang.String> 

*/
