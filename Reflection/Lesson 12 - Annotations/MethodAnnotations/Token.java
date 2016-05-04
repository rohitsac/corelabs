// Token.java - Annotation class
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Token {
    public String name();
    public int code();
}