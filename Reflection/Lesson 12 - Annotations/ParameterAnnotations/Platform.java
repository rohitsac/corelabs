// Platform.java - Annotation class
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Platform {
    public String what();
}