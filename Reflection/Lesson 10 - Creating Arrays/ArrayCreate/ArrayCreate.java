// ArrayCreate.java - create generic Arrays using class names
import java.lang.reflect.Array;

public class ArrayCreate {
   public static void main(String[] args) {
      String types[] = { "java.lang.Integer",
            "java.lang.Float", "java.lang.Double" };
      int len = 5;
      try {
        for (String type : types) {
            Number[] array = createArray(type, len += 5);
            System.out.format("%s ", array.getClass().getSimpleName());
            System.out.format("length = %d\n", Array.getLength(array));
        }
      } catch (Exception e) {
          e.printStackTrace(System.err);
      }
   }
   
   @SuppressWarnings("unchecked")
   static <T> T[] createArray(String className, int len)
      throws ClassNotFoundException, NegativeArraySizeException {
          Class<?> type = Class.forName(className);
          return (T[])Array.newInstance(type, len);
   }
}

/***********************************************

$ java ArrayCreate
Integer[] length = 10
Float[] length = 15
Double[] length = 20

*/