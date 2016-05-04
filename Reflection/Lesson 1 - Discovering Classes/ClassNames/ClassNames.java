// ClassNames.java -  Class names
import javax.swing.JButton;
import java.net.Socket;

public class ClassNames {
    public static void main(String[] args) {
        JButton b = new JButton();
        Class<?> c1 = b.getClass();
        System.out.println(c1.getName());
        Class<?> c2  = Socket.class;
        System.out.println(c2.getSimpleName());
        
    }
}

/******************************************

$ java ClassNames
javax.swing.JButton
Socket

*/