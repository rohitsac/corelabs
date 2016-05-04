// SuperClasses2.java -  Show superclass hierarchy, non-recursive
import java.util.ArrayList;
import javax.swing.JTextField;

public class SuperClasses2 {
    public static void main(String[] args) {
        showHierarchy(JTextField.class);
    }
    static void showHierarchy(Class<?> cls) {
        ArrayList<Class<?>> list = new ArrayList<Class<?>>();
        for (Class<?> c = cls; c != null; c = c.getSuperclass())
            list.add(0, c);     // add to front of list
        for (Class<?> c : list)
            System.out.println(c.getName());
    }
}

/******************************************

$ java SuperClasses2
java.lang.Object
java.awt.Component
java.awt.Container
javax.swing.JComponent
javax.swing.text.JTextComponent
javax.swing.JTextField

*/