// ParameterizedConstructors.java - Parameterized constructors
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

class MyClass {
    public MyClass(String string) { }
    public MyClass(Map<String, Integer> map, int i) { }
    private MyClass(ArrayList<String> list) { }
}

public class ParameterizedConstructors {
    public static void main(String[] args) {
        showParametetizedConstructorParameters(MyClass.class);
    }
    
    static void showParametetizedConstructorParameters(Class<?> c) {
        System.out.format("%s\n", c.getName());
        Constructor<?>[] constrs = c.getDeclaredConstructors();

        for (Constructor<?> ctor : constrs) {
            Type[] types = ctor.getGenericParameterTypes();
            for (Type type : types)
                if (type instanceof ParameterizedType) {
                    ParameterizedType ptype = (ParameterizedType)type;
                    System.out.format("  Constructor Parameter Raw Type: %s\n",
                            ptype.getRawType());
                    
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

$ java ParameterizedConstructors
MyClass
  Constructor Parameter Raw Type: interface java.util.Map
  Actual Type Arguments: <class java.lang.String> <class java.lang.Integer>
  Constructor Parameter Raw Type: class java.util.ArrayList
  Actual Type Arguments: <class java.lang.String> 

*/
