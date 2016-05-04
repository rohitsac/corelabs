// ParameterAnnotations.java - Parameter annotations with reflection
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class ParameterAnnotations {
    public static void main(String[] args) {
        showMethodParameterAnnotations(MyClass.class);
        showConstructorParameterAnnotations(MyClass.class);
    }

    static void showMethodParameterAnnotations(Class<?> c) {
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[][] annotations = method.getParameterAnnotations();
            for (Annotation[] annotationArray : annotations)
                for (Annotation annotation : annotationArray) {
                    System.out.format("%s Method Parameter Annotation: %s\n",
                        method.getName(), annotation);
                    if (annotation instanceof Token) {
                        Token token = (Token)annotation;
                        System.out.format("%s %s\n", token.name(), token.code());
                    }
                    if (annotation instanceof Platform) {
                        Platform platform = (Platform)annotation;
                        System.out.format("%s\n", platform.what());
                    }
            }
        }
    }

    static void showConstructorParameterAnnotations(Class<?> c) {
        Constructor<?>[] constrs = c.getDeclaredConstructors();
        for (Constructor<?> ctor : constrs) {
            Annotation[][] annotations = ctor.getParameterAnnotations();
            for (Annotation[] annotationArray : annotations)
               for (Annotation annotation : annotationArray) {
                    System.out.format("%s Constructor Parameter Annotation: %s\n",
                        ctor.getName(), annotation);
                    if (annotation instanceof Token) {
                        Token token = (Token)annotation;
                        System.out.format("%s %s\n", token.name(), token.code());
                    }
                    if (annotation instanceof Platform) {
                        Platform platform = (Platform)annotation;
                        System.out.format("%s\n", platform.what());
                    }
               }
        }
    }
}

/*****************************************************

$ java ParameterAnnotations
write Method Parameter Annotation: @Token(name=Method Parameter, code=50)
Method Parameter 50
write Method Parameter Annotation: @Platform(what=Mac)
Mac
write Method Parameter Annotation: @Token(name=Method Parameter, code=50)
Method Parameter 50
MyClass Constructor Parameter Annotation: @Token(name=Constructor Parameter, code=50)
Constructor Parameter 50
MyClass Constructor Parameter Annotation: @Platform(what=Mac)
Mac

*/
