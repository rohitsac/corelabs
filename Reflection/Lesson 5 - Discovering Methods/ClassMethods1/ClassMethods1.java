// ClassMethods1.java - discover class methods
import java.io.IOException;
import java.lang.reflect.Method;

class Thing {
    private double data;
    private void add(double v) { }
    protected void sub(int s) { }
    public double getData() throws IOException { return data; }
}

class MyThing extends Thing {
    private String name;
    private void mult(int len) { }
    protected void div(double v) { }
    public String getName() { return name; }
}

public class ClassMethods1 {
    public static void main(String[] args) {
        try {
            showPublicMethod(MyThing.class);
            showAnyMethod(MyThing.class);
            showPublicMethods(MyThing.class);
            showAllMethods(Thing.class);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    static void showPublicMethod(Class<?> c) throws NoSuchMethodException {
        System.out.println("Public Methods for " + c.getName());
        Method method1 = c.getMethod("getName");
        System.out.println(method1);
        Method method2 = c.getMethod("getData");
        System.out.println(method2);
    }

    static void showAnyMethod(Class<?> c) throws NoSuchMethodException {
        System.out.println("\nAny Method for " + c.getName());
        Method method = c.getDeclaredMethod("div", double.class);
        System.out.println(method);
    }

    static void showPublicMethods(Class<?> c) {
        System.out.println("\nPublic Methods for " + c.getName());
        Method[] methods = c.getMethods();
        for (Method method : methods)
            System.out.println(method);
    }

    static void showAllMethods(Class<?> c) {
        System.out.println("\nAll Methods for "+ c.getName());
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods)
            System.out.println(method); 
    }
}

/***********************************************

$ java ClassMethods1
Public Methods for MyThing
public java.lang.String MyThing.getName()
public double Thing.getData() throws java.io.IOException

Any Method for MyThing
protected void MyThing.div(double)

Public Methods for MyThing
public java.lang.String MyThing.getName()
public double Thing.getData() throws java.io.IOException
public final void java.lang.Object.wait() throws java.lang.InterruptedException
public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
public boolean java.lang.Object.equals(java.lang.Object)
public java.lang.String java.lang.Object.toString()
public native int java.lang.Object.hashCode()
public final native java.lang.Class java.lang.Object.getClass()
public final native void java.lang.Object.notify()
public final native void java.lang.Object.notifyAll()

All Methods for Thing
private void Thing.add(double)
public double Thing.getData() throws java.io.IOException
protected void Thing.sub(int)

*/
