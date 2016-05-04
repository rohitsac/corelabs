// ConstructorAnnotations.java - Constructor annotations with reflection
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

class ConstructorAnnotations {
    public static void main(String[] args) {
        showConstructorAnnotations(MyClass.class);
    }

    static void showConstructorAnnotations(Class<?> c) {
        Constructor<?>[] constrs = c.getDeclaredConstructors();
        for (Constructor<?> ctor : constrs) {
            Annotation[] annotations = ctor.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.format("Constructor %s Annotation: %s\n",
                    ctor.getName(), annotation);
                if (annotation instanceof Token) {
                    Token token = (Token)annotation;
                    System.out.format("%s %s\n", token.name(), token.code());
                }
            }
            if (ctor.isAnnotationPresent(Platform.class)) {
                Platform platform = ctor.getAnnotation(Platform.class);
                System.out.format("%s\n", platform.what());
            }
        }
    }
}

/*****************************************************

$ java ConstructorAnnotations
Constructor MyClass Annotation: @Platform(what=Mac)
Constructor MyClass Annotation: @Token(name=Default Constructor, code=40)
Default Constructor 40
Mac
Constructor MyClass Annotation: @Token(name=Constructor, code=40)
Constructor 40

*/
