// Modifiers.java - class modifiers
import java.lang.reflect.Modifier;

public class Modifiers {
   public static void main(String[] args) {     
      checkClass(String.class);     // String is public final
   }
   
   static void checkClass(Class<?> c) {
        System.out.println(c.toString());
        int mod = c.getModifiers();
        boolean isPublic = Modifier.isPublic(mod);
        System.out.println("isPublic: " + isPublic);
	boolean isFinal = Modifier.isFinal(mod);
        System.out.println("isFinal: " + isFinal);
	boolean isAbstract = Modifier.isAbstract(mod);
        System.out.println("isAbstract: " + isAbstract);
        boolean isNative = Modifier.isNative(mod);
        System.out.println("isNative: " + isNative);
        System.out.println(c + " is " + Modifier.toString(mod));
        System.out.println(c.getSimpleName() + " is " +
            Modifier.toString(c.getModifiers()));
   }
}

/***********************************************

$ java Modifiers
class java.lang.String
isPublic: true
isFinal: true
isAbstract: false
isNative: false
class java.lang.String is public final
String is public final

*/