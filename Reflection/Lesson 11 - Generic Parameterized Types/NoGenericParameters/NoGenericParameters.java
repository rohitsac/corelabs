// NoGenericParameters.java - No generic parameters
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

class Thing {
    private ArrayList<Float> field1;
    private Map<String, Integer> field2;
}

public class NoGenericParameters {
    public static void main(String[] args) {
        Field[] fields = Thing.class.getDeclaredFields();
        for (Field field : fields)
            System.out.println(field.toString());
    }
}

/************************************************

$ java NoGenericParameters
private java.util.ArrayList Thing.field1
private java.util.Map Thing.field2

*/
