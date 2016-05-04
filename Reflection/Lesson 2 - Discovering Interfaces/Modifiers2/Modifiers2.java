// Modifiers2.java - interface modifiers
import java.lang.reflect.Modifier;

public class Modifiers2 {
   public static void main(String[] args) {     
      checkInterface(Cloneable.class);
   }
   
   static void checkInterface(Class<?> c) {
       System.out.println(c.getName() + " is a " +
           Modifier.toString(c.getModifiers()));
   }
}

/***********************************************

$ java Modifiers2
java.lang.Cloneable is a public abstract interface

*/