// FieldAnnotations.java - Field annotations with reflection
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

class FieldAnnotations {
    public static void main(String[] args) {
        showFieldAnnotations(MyClass.class);
    }

    static void showFieldAnnotations(Class<?> c) {
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.format("Field %s Annotation: %s\n",
                    field.getName(), annotation);
                if (annotation instanceof Token) {
                    Token token = (Token)annotation;
                    System.out.format("%s %s\n", token.name(), token.code());
                }
            }
            if (field.isAnnotationPresent(Platform.class)) {
                Platform platform = field.getAnnotation(Platform.class);
                System.out.format("%s\n", platform.what());
            }
        }
    }
}

/*****************************************************

$ java FieldAnnotations
Field data Annotation: @Token(name=Field, code=20)
Field 20
Field data Annotation: @Platform(what=Mac)
Mac

*/
