// PublicFields.java -  accessing public class fields
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Act {
    private int num;
    public Act(int num) { this.num = num; }
    public String brothers = "Groucho Chico Harpo";
    public String group = "BILL BRUCE JIM";
    public final String guy = "Bob";
}

public class PublicFields {
    public static void main(String[] args) {
        try {
            Act object = new Act(3);
            modifyPublicFields(object);
            System.out.println(object.brothers);
            System.out.println(object.group);
            System.out.println(object.guy);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    static <T> void modifyPublicFields(T obj)
            throws IllegalArgumentException, IllegalAccessException {
        Class<?> c = obj.getClass();
        Field[] fields = c.getFields();   // public fields
        for (Field field : fields)
            if (!Modifier.isFinal(field.getModifiers()) &&
                    field.getType() == String.class) {
                String str = (String)field.get(obj);
                field.set(obj, str.toLowerCase());
            }
    }
}

/***********************************************

$ java PublicFields
groucho chico harpo
bill bruce jim
Bob

*/
