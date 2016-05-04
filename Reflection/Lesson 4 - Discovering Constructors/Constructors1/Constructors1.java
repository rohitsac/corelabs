// Constructors1.java - discover class constructors
import java.io.IOException;
import java.lang.reflect.Constructor;

class Thing {
    public Thing() { }
    public Thing(boolean flag) { }
    public Thing(String s, int i) { }
    public Thing(int i) throws IOException { }
    protected Thing(float f) { }
    private Thing(char c) { }
}

public class Constructors1 {
    public static void main(String[] args) {
        try {
            showPublicConstructor(Thing.class);
            showAnyConstructor(Thing.class);
            showPublicConstructors(Thing.class);
            showAllConstructors(Thing.class);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    static void showPublicConstructor(Class<?> c) throws NoSuchMethodException {
        System.out.println("Public Constructor for " + c.getName());
        Constructor<?> ctor1 = c.getConstructor();   // default constr
        System.out.println(ctor1.toString());
        Constructor<?> ctor2 = c.getConstructor(String.class, int.class);
        System.out.println(ctor2);
    }

    static void showAnyConstructor(Class<?> c) throws NoSuchMethodException {
        System.out.println("\nAny Constructor for " + c.getName());
        Constructor<?> ctor = c.getDeclaredConstructor(float.class);  
        System.out.println(ctor);
    }

    static void showPublicConstructors(Class<?> c) {
        System.out.println("\nPublic Constructors for " + c.getName());
        Constructor<?>[] constrs = c.getConstructors();
        for (Constructor<?> ctor : constrs)
            System.out.println(ctor);
    }

    static void showAllConstructors(Class<?> c) {
        System.out.println("\nAll Constructors for " + c.getName());
        Constructor<?>[] constrs = c.getDeclaredConstructors();
        for (Constructor<?> ctor : constrs)
            System.out.println(ctor); 
    }
}

/***********************************************

$ java Constructors1
Public Constructor for Thing
public Thing()
public Thing(java.lang.String,int)

Any Constructor for Thing
protected Thing(float)

Public Constructors for Thing
public Thing()
public Thing(boolean)
public Thing(java.lang.String,int)
public Thing(int) throws java.io.IOException

All Constructors for Thing
public Thing()
public Thing(boolean)
public Thing(java.lang.String,int)
public Thing(int) throws java.io.IOException
protected Thing(float)
private Thing(char)

*/
