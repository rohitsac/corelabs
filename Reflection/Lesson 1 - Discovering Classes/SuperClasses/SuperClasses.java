// SuperClasses.java -  Show superclass hierarchy, recursive
import javax.swing.JTextField;

public class SuperClasses {
    public static void main(String[] args) {
        showHierarchy(JTextField.class);
    }
    static void showHierarchy(Class<?> c) {
        if (c.getSuperclass() == null) {
            System.out.println(c.getName());
            return;
        }
        showHierarchy(c.getSuperclass());
        System.out.println(c.getName());
    }
}

/******************************************

$ java SuperClasses
java.lang.Object
java.awt.Component
java.awt.Container
javax.swing.JComponent
javax.swing.text.JTextComponent
javax.swing.JTextField

*/