// ArgConstructor.java - call constructors with arguments
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComponent;

public class ArgConstructor {
  public static void main(String[] args) {
      Object[] params = { "Input", 20 };
      Class<?>[] ptypes = { String.class, int.class };
      String names[] = { "javax.swing.JTextField",
          "javax.swing.JPasswordField" };
      try {
          for (String name : names) {
              JComponent comp = createObject(name, params, ptypes);
              comp.setVisible(true);
              System.out.println(comp.getClass().getName());
          }
      } catch (Exception e) {
          e.printStackTrace(System.err);
      }
   }
  
   @SuppressWarnings("unchecked")
   static <T> T createObject(String className, Object[] params, Class<?>[] ptypes)
        throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, NoSuchMethodException,
                IllegalArgumentException, InvocationTargetException {
          Class<?> c = Class.forName(className);
          Constructor<?> constr = c.getConstructor(ptypes);
          return (T)constr.newInstance(params);
   }
}

/********************************************************

$ java ArgConstructor
javax.swing.JTextField
javax.swing.JPasswordField

*/