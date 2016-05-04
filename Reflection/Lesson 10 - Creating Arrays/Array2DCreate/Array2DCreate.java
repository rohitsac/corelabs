// Array2DCreate.java - create generic 2D Arrays using class names
import java.lang.reflect.Array;

public class Array2DCreate {
   public static void main(String[] args) {
      String names[] = { "java.lang.Integer",
            "java.lang.Float", "java.lang.Double" };
      int rows = 2, cols = 3;
      try {
        for (String name : names) {
            Number[][] array = create2DArray(name, rows, cols);
            System.out.format("%s ", array.getClass().getSimpleName());
            System.out.format("rows = %d cols = %d\n", 
                Array.getLength(array), Array.getLength(Array.get(array, 0)));
        }
      } catch (Exception e) {
          e.printStackTrace(System.err);
      }
   }
   
   @SuppressWarnings("unchecked")
   static <T> T[][] create2DArray(String className, int rows, int cols)
      throws ClassNotFoundException, NegativeArraySizeException {
          Class<?> type = Class.forName(className);
          return (T[][])Array.newInstance(type, rows, cols);
   }
}

/***********************************************

$ java Array2DCreate
Integer[][] rows = 2 cols = 3
Float[][] rows = 2 cols = 3
Double[][] rows = 2 cols = 3

*/