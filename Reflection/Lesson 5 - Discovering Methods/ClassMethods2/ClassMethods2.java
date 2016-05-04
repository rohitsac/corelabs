// ClassMethods2.java - Show public class methods
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassMethods2 {
   public static void main(String[] args) {
      showPublicMethods(Object.class);
   }
   
   static void showPublicMethods(Class<?> c) {
      Method[] methods = c.getMethods();
      for (Method method : methods) {
          System.out.format("%s ", 
                  Modifier.toString(method.getModifiers()));
          String retType = method.getReturnType().getName();
          System.out.format("%s %s( ", retType, method.getName());
          Class<?>[] ptypes = method.getParameterTypes();
          for (Class<?> param : ptypes)
              System.out.format("%s ", param.getName());
          System.out.format(")");
          Class<?>[] extypes = method.getExceptionTypes();
          if (extypes.length > 0 ) 
              System.out.format(" throws ");
          for (Class<?> ex : extypes)
              System.out.format("%s ", ex.getName());
          System.out.println();
       }
   }
}

/***********************************************

$ java ClassMethods2
public final void wait( ) throws java.lang.InterruptedException 
public final native void wait( long ) throws java.lang.InterruptedException 
public final void wait( long int ) throws java.lang.InterruptedException 
public boolean equals( java.lang.Object )
public java.lang.String toString( )
public native int hashCode( )
public final native java.lang.Class getClass( )
public final native void notify( )
public final native void notifyAll( )

*/