// ClassAnnotations.java - Class annotations with reflection
import java.lang.annotation.Annotation;

class ClassAnnotations {
    public static void main(String[] args) {
        showClassAnnotations(MyClass.class);
    }

    static void showClassAnnotations(Class<?> c) { 
        Annotation[] annotations = c.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.format("Class %s Annotation: %s\n",
                c.getName(), annotation);      // calls toString()
            if (annotation instanceof Token) {
                Token token = (Token)annotation;
                System.out.format("%s %s\n", token.name(), token.code());
            }
        } 
        if (c.isAnnotationPresent(Platform.class)) {
            Platform platform = c.getAnnotation(Platform.class);
            System.out.format("%s\n", platform.what());
        }
        if (Token.class.isAnnotation()) 
            System.out.format("Token is an annotation class\n");
    }
}

/*****************************************************

$ java ClassAnnotations
Class MyClass Annotation: @Token(name=Class, code=10)
Class 10
Class MyClass Annotation: @Platform(what=Mac)
Mac
Token is an annotation class

*/
