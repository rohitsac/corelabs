// ColorPicker.java - Color Picker class
import java.awt.Color;

public class ColorPicker {
    private Color[] colors;
    public ColorPicker(Color[] colors) { 
        this.colors = colors;
    }
    public void print() {
        for (Color color : colors)
            System.out.println(color);
    }
}
