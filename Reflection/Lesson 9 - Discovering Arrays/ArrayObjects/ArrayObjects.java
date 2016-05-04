// ArrayObjects.java - find arrays of different types

public class ArrayObjects {
    public static void main(String[] args) {
        try {
            String name = "java.lang.String";
            Class<?> c = getClass(name);
            System.out.println(c.getName());
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
    public static Class<?> getClass(String name) throws ClassNotFoundException {
        if (name.equals("char")) return char.class;
        if (name.equals("int")) return int.class;
        if (name.equals("float")) return float.class;
        if (name.equals("double")) return double.class;
        return Class.forName(name); 
    }
}

/***********************************************

$ java ArrayObjects
java.lang.String

With String array = "[Ljava.lang.String;";
$ java ArrayObjects
[Ljava.lang.String;

With String array = "[[Ljava.lang.String;";
$ java ArrayObjects
[[Ljava.lang.String;

*/
