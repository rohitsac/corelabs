// ArrayFields.java - show array fields
import java.lang.reflect.Field;
import javax.swing.JButton;

class MyPanel {
    public boolean visible;
    public int[] codes;
    private boolean[] states;
    public float[][] matrix;
    public JButton[] buttons;
}

public class ArrayFields {
    public static void main(String[] args) {
        showArrayFields(MyPanel.class);
    }

    static void showArrayFields(Class<?> cls) {
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields)
            if (field.getType().isArray())
                System.out.format("%s: %s\n",
                    field, field.getType().getName());
    }
}

/***********************************************

$ java ArrayFields
public int[] MyPanel.codes: [I
private boolean[] MyPanel.states: [Z
public float[][] MyPanel.matrix: [[F
public javax.swing.JButton[] MyPanel.buttons: [Ljavax.swing.JButton;

*/
