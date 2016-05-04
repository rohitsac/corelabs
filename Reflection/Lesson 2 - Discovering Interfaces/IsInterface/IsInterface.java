// IsInterface.java - show classes and interfaces
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import javax.sql.RowSet;
import javax.sql.RowSetEvent;

public class IsInterface {
    public static void main(String[] args) {
        Class<?>[] names = { RowSet.class, RowSetEvent.class,
            RandomAccess.class, RandomAccessFile.class };
        showInterfacesClassses(names);
    }

    static void showInterfacesClassses(Class<?>[] names) {
        for (Class<?> c : names) {
            if (c.isInterface())
                System.out.println(c.getName() + " is an interface");
            else
                System.out.println(c.getName() + " is a class");
        }
    }
}

/******************************************

$ java IsInterface
javax.sql.RowSet is an interface
javax.sql.RowSetEvent is a class
java.util.RandomAccess is an interface
java.io.RandomAccessFile is a class

*/
