// Constructors2.java - show public constructors
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.net.ServerSocket;

public class Constructors2 {
    public static void main(String[] args){
        showPublicConstructors(ServerSocket.class);
    }
    
    static void showPublicConstructors(Class<?> c) {
        Constructor<?>[] constrs = c.getConstructors();
        for (Constructor<?> ctor : constrs) {
            System.out.format("%s ", 
                    Modifier.toString(ctor.getModifiers()));
            System.out.format(ctor.getDeclaringClass().getName());
            System.out.format("( ");
            Class<?>[] ptypes = ctor.getParameterTypes();
            for (Class<?> param : ptypes)
                System.out.format("%s ", param.getName());
            System.out.format(")");
            Class<?>[] extypes = ctor.getExceptionTypes();
            if (extypes.length > 0)
                System.out.format(" throws ");
            for (Class<?> ex : extypes)
                System.out.format("%s ", ex.getName());
            System.out.println();
        }
    }
}

/***********************************************************

$ java Constructors2
public java.net.ServerSocket( ) throws java.io.IOException 
public java.net.ServerSocket( int ) throws java.io.IOException 
public java.net.ServerSocket( int int ) throws java.io.IOException 
public java.net.ServerSocket( int int java.net.InetAddress ) throws java.io.IOException 

*/
