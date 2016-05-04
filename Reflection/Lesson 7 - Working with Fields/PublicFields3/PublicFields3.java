// PublicFields3.java -  accessing public primitive fields
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Act {
    private int num;
    public Act(int num) { this.num = num; }
    public int count = 10;
    public int val = 20;
    public final int data = 30;
}

public class PublicFields3 {
    public static void main(String[] args) {
        try {
            Act object = new Act(3);
            modifyPublicFields(object);
            System.out.println(object.count);
            System.out.println(object.val);
            System.out.println(object.data);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    static <T> void modifyPublicFields(T obj)
            throws IllegalArgumentException, IllegalAccessException {
        Class<?> c = obj.getClass();
        Field[] fields = c.getFields();    // public fields
        for (Field field : fields)
            if (!Modifier.isFinal(field.getModifiers()) &&
                    field.getType() == int.class) {
                int val = field.getInt(obj);
                field.setInt(obj, ++val);
            }
    }
}

/***********************************************

$ java PublicFields3
11
21
30

*/
