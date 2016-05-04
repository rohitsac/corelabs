// ArrayElements.java - One dimensional Array with getters/setters
import java.lang.reflect.Array;

public class ArrayElements {
    public static void main(String[] args) {
        try {
            Object array = makeArray(10, int.class, 1);
            printArray(array);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
    
    static Object makeArray(int len, Class<?> c, Object ival) {
        Object array = Array.newInstance(c, len);
        for (int i = 0; i < len; i++)
            Array.set(array, i, ival);
        return array;
    }

    static void printArray(Object array) {
        Class<?> c = array.getClass().getComponentType();
        for (int i = 0; i < Array.getLength(array); i++) {
            if (c == int.class) {
                int elem = Array.getInt(array, i);
                System.out.format("%d ", elem);
            }
            if (c == double.class) {
                double elem = Array.getDouble(array, i);
                System.out.format("%4.2f ", elem);
            }
            if (c == String.class) {
                String elem = (String)Array.get(array, i);
                System.out.format("%s ", elem);
            }
        }
        System.out.println();
    }
}

/***********************************************

Object array = make1DArray(10, int.class, 1);

$ java ArrayElements
1 1 1 1 1 1 1 1 1 1 

Object array = make1DArray(10, double.class, 1.23);

$ java ArrayElements
1.23 1.23 1.23 1.23 1.23 1.23 1.23 1.23 1.23 1.23 

Object array = make1DArray(10, String.class, "data");

$ java ArrayElements
data data data data data data data data data data 

*/
