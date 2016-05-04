// MyInject.java - Annotation class
package asg;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyInject {
    public String name();
}