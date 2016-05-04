// ProtectedFields.java -  accessing protected class fields
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

class Thing {
    public Thing() { }
    protected String brothers = "Groucho Chico Harpo";
    protected String group = "BILL BRUCE JIM";
    protected final String guy = "Bob";
    public String getBrothers() { return brothers; }
    public String getGroup() { return group; }
    public String getGuy() { return guy; }
}

class MyThing extends Thing {
    protected String girls = "Sue Mary Carol";
    public String getGirls() { return girls; }
}

public class ProtectedFields {
    public static void main(String[] args) {
        try {
            MyThing object = new MyThing();
            modifyProtectedFields(object);
            System.out.println(object.getBrothers());
            System.out.println(object.getGroup());
            System.out.println(object.getGirls());
            System.out.println(object.getGuy());
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    static <T> void modifyProtectedFields(T obj)
            throws IllegalArgumentException, IllegalAccessException,
                SecurityException {
        Class<?> c = obj.getClass();
        Field[] fields = getProtectedFields(obj);
        for (Field field : fields) {
            int mods = field.getModifiers();
            if (!Modifier.isFinal(mods) && field.getType() == String.class) {
                field.setAccessible(true);
                String str = (String)field.get(obj);
                field.set(obj, str.toLowerCase());
            }
        }
    }
    
    static <T> Field[] getProtectedFields(T obj) {
        Class<?> c = obj.getClass();
        ArrayList<Field> list = new ArrayList<Field>();
        while (c != null) {
            Field[] fields = c.getDeclaredFields();
            for (Field field : fields)
                if (Modifier.isProtected(field.getModifiers())) {
                    list.add(field);
                    System.out.println(field);
                }
            c = c.getSuperclass();
        }
        return list.toArray(new Field[list.size()]);
    }
}

/***********************************************

$ java ProtectedFields
protected java.lang.String MyThing.girls
protected java.lang.String Thing.brothers
protected java.lang.String Thing.group
protected final java.lang.String Thing.guy
groucho chico harpo
bill bruce jim
sue mary carol
Bob

*/
