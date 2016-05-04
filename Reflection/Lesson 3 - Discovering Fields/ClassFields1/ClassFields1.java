// ClassFields1.java - Discover class fields
import java.lang.reflect.Field;

class Thing {
    private boolean flag;
    protected float f;
    public char c;
}

class MyThing extends Thing {
    private int num;
    protected String str;
    public double val;
}

public class ClassFields1 {
    public static void main(String[] args)  {
        try {
            showPublicField(MyThing.class);
            showAnyField(Thing.class);
            showPublicFields(MyThing.class);
            showAllFields(Thing.class);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    static void showPublicField(Class<?> c) throws NoSuchFieldException {
        System.out.println("Public Fields for class " + c.getName());
        Field field = c.getField("val");
        System.out.println(field.toString());
        field = c.getField("c");
        System.out.println(field);
    }

    static void showAnyField(Class<?> c) throws NoSuchFieldException {
        System.out.println("\nAny Field for only class "+ c.getName());
        Field field = c.getDeclaredField("f");
        System.out.println(field);
    }

    static void showPublicFields(Class<?> c) {
        System.out.println("\nPublic Fields for class " + c.getName());
        Field[] fields = c.getFields();
        for (Field field : fields)
            System.out.println(field); 
    }

    static void showAllFields(Class<?> c) {
        System.out.println("\nAll Fields for only class "+ c.getName() );
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields)
            System.out.println(field); 
    }
}

/***********************************************

$ java ClassFields1
Public Fields for class MyThing
public double MyThing.val
public char Thing.c

Any Field for only class Thing
protected float Thing.f

Public Fields for class MyThing
public double MyThing.val
public char Thing.c

All Fields for only class Thing
private boolean Thing.flag
protected float Thing.f
public char Thing.c

*/
