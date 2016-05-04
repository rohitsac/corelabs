// MethodAnnotations.java - Method annotations with reflection
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class MethodAnnotations {
    public static void main(String[] args) {
        showMethodAnnotations(MyClass.class);     
    }

    static void showMethodAnnotations(Class<?> c ) {
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.format("Method %s Annotation: %s\n",
                    method.getName(), annotation);
                if (annotation instanceof Token) {
                    Token token = (Token)annotation;
                    System.out.format("%s %s\n", token.name(), token.code());
                }
            }
            if (method.isAnnotationPresent(Platform.class)) {
                Platform platform = method.getAnnotation(Platform.class);
                System.out.format("%s\n", platform.what());
            }
        }
    }
}

/*****************************************************

$ java MethodAnnotations
Method write Annotation: @Token(name=Method, code=30)
Method 30
Method write Annotation: @Platform(what=Mac)
Mac
Method read Annotation: @Token(name=Void Method, code=30)
Void Method 30

*/
