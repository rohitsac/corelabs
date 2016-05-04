// Interfaces.java - find interfaces

public class Interfaces {
    public static void main(String[] args) {
        showInterfaceNames(String.class);
    }

    static void showInterfaceNames(Class<?> c) {
        Class<?>[] interfaces = c.getInterfaces();
        for (Class<?> intf : interfaces)
            System.out.println(intf.getName());
    }
}

/******************************************

$ java Interfaces
java.io.Serializable
java.lang.Comparable
java.lang.CharSequence

*/
