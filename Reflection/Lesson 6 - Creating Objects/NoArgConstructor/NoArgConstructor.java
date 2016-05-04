// NoArgConstructor.java - call no argument constructor
import javax.swing.JComponent;

class MyComponent extends JComponent {
    private String name;
    public MyComponent() { }
    public MyComponent(String name) { this.name = name; }
}

public class NoArgConstructor {
   public static void main(String[] args) {
      String names[] = { "javax.swing.JButton",
            "javax.swing.JTextField", "MyComponent" };
      try {
        for (String name : names) {
            JComponent comp = createObject(name);
            comp.setVisible(false);
            System.out.println(comp.getClass().getName());
        }
      } catch (Exception e) {
          e.printStackTrace(System.err);
      }
   }
   
   @SuppressWarnings("unchecked")
   static <T> T createObject(String className)
      throws ClassNotFoundException, InstantiationException,
                IllegalAccessException {
          Class<?> c = Class.forName(className);
          return (T)c.newInstance();
   }
}

/***********************************************

$ java NoArgConstructor
javax.swing.JButton
javax.swing.JTextField
MyComponent

*/