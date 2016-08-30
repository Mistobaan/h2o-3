package hex.framework.annotations;

/**
 * Created by fmilo on 8/29/16.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE);
public @interface RegisterKernel {

    String Name() default "<no name>";
    String [] Device() default "h2o";
    String [] TypeConstraint() default "<no doc>";
}
