// ArrayComponents.java - show array component types
import javax.swing.JButton;

public class ArrayComponents {
    public static void main(String[] args) {
        double[] vals = new double[10];
        JButton[] buttons = new JButton[4];
        String[][] grid = new String[3][4];
        showArrayComponents(vals);
        showArrayComponents(buttons);
        showArrayComponents(grid);
    }

    static <T> void showArrayComponents(T obj) {
        Class<?> c = obj.getClass();
        if (c.isArray())
            System.out.format("%s: %s\n", c, c.getComponentType().getName());
    }
}

/***********************************************

$ java ArrayComponents
class [D: double
class [Ljavax.swing.JButton;: javax.swing.JButton
class [[Ljava.lang.String;: [Ljava.lang.String;

*/
