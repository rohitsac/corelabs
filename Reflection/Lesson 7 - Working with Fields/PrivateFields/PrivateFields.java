// PrivateFields.java -  accessing private class fields
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Act {
    private int num;
    public Act(int num) { this.num = num; }
    private String brothers = "Groucho Chico Harpo";
    private String group = "BILL BRUCE JIM";
    private final String guy = "Bob";
    public String getBrothers() { return brothers; }
    public String getGroup() { return group; }
    public String getGuy() { return guy; }
}

public class PrivateFields {
    public static void main(String[] args) {
        try {
            Act object = new Act(3);
            modifyPrivateFields(object);
            System.out.println(object.getBrothers());
            System.out.println(object.getGroup());
            System.out.println(object.getGuy());
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    static <T> void modifyPrivateFields(T obj)
            throws IllegalArgumentException, IllegalAccessException,
                SecurityException {
        Class<?> c = obj.getClass();
        Field[] fields = c.getDeclaredFields();    // private fields
        for (Field field : fields) {
            int mods = field.getModifiers();
            if (Modifier.isPrivate(mods) && !Modifier.isFinal(mods) &&
                    field.getType() == String.class) {
                field.setAccessible(true);
                String str = (String)field.get(obj);
                field.set(obj, str.toLowerCase());
            }
        }
    }
}

/***********************************************

$ java PrivateFields
groucho chico harpo
bill bruce jim
Bob

*/
