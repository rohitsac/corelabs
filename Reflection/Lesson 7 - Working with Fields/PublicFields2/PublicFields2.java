// PublicFields2.java -  accessing public Color fields
import java.awt.Color;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class PublicFields2 {
    public static void main(String[] args) {
        try {
            Color[] colors = getColorFields();
            ColorPicker picker = new ColorPicker(colors);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    static Color[] getColorFields() throws IllegalAccessException {
        ArrayList<Color> list = new ArrayList<Color>();
        Color colorObject = new Color(0);
        Field[] colorFields = Color.class.getFields();
        for (Field field : colorFields) {
            String className = field.getDeclaringClass().getSimpleName();
            String fieldName = field.getName();
            if (Modifier.isStatic(field.getModifiers()) &&
                fieldName.equals(fieldName.toUpperCase()) &&
                    field.getType() == Color.class) {
                Color color = (Color)field.get(colorObject);
                list.add(color);
                System.out.format("%s.%-15s%s\n", className, fieldName, color);
            }
        }
        return list.toArray(new Color[list.size()]);
    }
}

/***********************************************

$ java PublicFields2
Color.WHITE          java.awt.Color[r=255,g=255,b=255]
Color.LIGHT_GRAY     java.awt.Color[r=192,g=192,b=192]
Color.GRAY           java.awt.Color[r=128,g=128,b=128]
Color.DARK_GRAY      java.awt.Color[r=64,g=64,b=64]
Color.BLACK          java.awt.Color[r=0,g=0,b=0]
Color.RED            java.awt.Color[r=255,g=0,b=0]
Color.PINK           java.awt.Color[r=255,g=175,b=175]
Color.ORANGE         java.awt.Color[r=255,g=200,b=0]
Color.YELLOW         java.awt.Color[r=255,g=255,b=0]
Color.GREEN          java.awt.Color[r=0,g=255,b=0]
Color.MAGENTA        java.awt.Color[r=255,g=0,b=255]
Color.CYAN           java.awt.Color[r=0,g=255,b=255]
Color.BLUE           java.awt.Color[r=0,g=0,b=255]

*/
