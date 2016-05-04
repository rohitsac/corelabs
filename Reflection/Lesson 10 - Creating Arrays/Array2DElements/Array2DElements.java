// Array2DElements.java - Two dimensional Array with getters/setters
import java.lang.reflect.Array;

public class Array2DElements {
    public static void main(String[] args) {
        Object array = make2DArray(2, 3, int.class, 1);
        print2DArray(array);
    }

    static Object make2DArray(int rows, int cols, Class<?> c, Object ival) {
        Object array = Array.newInstance(c, rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                Array.set(Array.get(array, i), j, ival);
	return array;
    }
    
    static void print2DArray(Object array) {
        int rows = Array.getLength(array);
        int cols = Array.getLength(Array.get(array, 0));
        Class<?> c = array.getClass().getComponentType();
        for (int i = 0; i < rows; i++) {
            Object row = Array.get(array, i);
            for (int j = 0; j < cols; j++) {
                if (c == int[].class) {
                    int elem = Array.getInt(row, j);  
                    System.out.format("%d ", elem);
                }
                if (c == double[].class) {
                    double elem = Array.getDouble(row, j);  
                    System.out.format("%4.2f ", elem);
                }
                if (c == String[].class) {
                    String elem = (String)Array.get(row, j); 
                    System.out.format("%s ", elem);
                }
            }
            System.out.println();
        }
    }
}

/***********************************************

Object array = make2DArray(2, 3, int.class, 1);

$ java Array2DElements
1 1 1 
1 1 1 

Object array = make2DArray(2, 3, double.class, 1.23);

$ java Array2DElements
1.23 1.23 1.23 
1.23 1.23 1.23  

Object array = make2DArray(2, 3, String.class, "data");

$ java Array2DElements
data data data 
data data data  

*/
