// ParameterizedFields.java - Parameterized fields
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

class MyClass {
    private int number;
    private ArrayList<Float> field1;
    private Map<String, Integer> field2;
}

public class ParameterizedFields {
    public static void main(String[] args) {
        showParameterizedFields(MyClass.class);
    }

    static void showParameterizedFields(Class<?> c) {
        System.out.format("%s\n", c.getName());
        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {
            Type type = field.getGenericType();
            if (type instanceof ParameterizedType) {
                ParameterizedType ptype = (ParameterizedType)type;
                System.out.format("  Field %s Raw Type: %s\n",
                        field.getName(), ptype.getRawType());
                
                Type[] ptypes = ptype.getActualTypeArguments();
                System.out.format("  Actual Type Arguments: ");
                for (Type pt : ptypes)
                    System.out.format("<%s> ", pt);
                System.out.println();
            }
        }
   }
}

/********************************************************

$ java ParameterizedFields
MyClass
  Field field1 Raw Type: class java.util.ArrayList
  Actual Type Arguments: <class java.lang.Float>
  Field field2 Raw Type: interface java.util.Map
  Actual Type Arguments: <class java.lang.String> <class java.lang.Integer> 


*/
