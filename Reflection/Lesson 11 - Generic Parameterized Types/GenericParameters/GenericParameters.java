// GenericParameters.java - Generic parameters
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

class Thing {
    private ArrayList<Float> field1;
    private Map<String, Integer> field2;
}

public class GenericParameters {
    public static void main(String[] args) {
        Field[] fields = Thing.class.getDeclaredFields();
        for (Field field : fields)
            System.out.println(field.toGenericString());
    }
}

/************************************************

$ java GenericParameters
private java.util.ArrayList<java.lang.Float> Thing.field1
private java.util.Map<java.lang.String, java.lang.Integer> Thing.field2

*/
