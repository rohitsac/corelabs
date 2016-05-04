// MyGenericStringMethods.java - Custom toGenericString() for methods
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

class Methods {
    private ArrayList<String> list;
    private Map<String, Integer> map;
    protected void nothing() { }
    public static void print(Integer i, Map m) throws IOException { }
    private Map<String, Integer> getMap(ArrayList<String> n, double d) { 
        return map; 
    }
    public final ArrayList<String> getList() throws SQLException, IOException { 
        return list; 
    }
}

public class MyGenericStringMethods {
    public static void main(String[] args) {
        showMethods(Methods.class);
    }

    static void showMethods(Class<?> c) {
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods)
            System.out.println(myGenericString(method));
    }

    static String myGenericString(Method method) {
        StringBuilder str = new StringBuilder();
        str.append(Modifier.toString(method.getModifiers()));
        str.append(" ").append(method.getGenericReturnType());
        str.append(" ").append(method.getDeclaringClass().getName());
        str.append(".").append(method.getName());
        str.append("(").append(getParameters(method)).append(")");
        str.append(" ").append(getExceptions(method));
        return str.toString();
    }

    static String getParameters(Method method) {
        StringBuilder str = new StringBuilder();
        Type[] pTypes = method.getGenericParameterTypes();
        if (pTypes.length == 0) return str.toString();
        for (int i = 0; i < pTypes.length; i++) {
            str.append(pTypes[i]);
            if (pTypes.length != 1 && i != pTypes.length-1)
                str.append(",");
        }
        return str.toString().replaceAll("class |interface ", "");
    }
    
    static String getExceptions(Method method) {
        StringBuilder str = new StringBuilder();
        Type[] exTypes = method.getGenericExceptionTypes();
        if (exTypes.length == 0) return str.toString();
        str.append("throws ");
        for (int i = 0; i < exTypes.length; i++) {
            str.append(exTypes[i]);
            if (exTypes.length != 1 && i != exTypes.length-1)
                str.append(",");
        }
        return str.toString().replaceAll("class |interface ", "");
    }
}

/********************************************************

$ java GenericStringMethods
public static void Methods.print(java.lang.Integer,java.util.Map) throws java.io.IOException
private java.util.Map<java.lang.String, java.lang.Integer> Methods.getMap(java.util.ArrayList<java.lang.String>,double)
protected void Methods.nothing()
public final java.util.ArrayList<java.lang.String> Methods.getList() throws java.sql.SQLException,java.io.IOException
*/
