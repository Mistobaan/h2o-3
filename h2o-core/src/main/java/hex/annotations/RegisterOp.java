package hex.framework.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE);
public @interface RegisterOp {

    String Name() default "<no name>";
    String [] Input() default "<no input>";
    String [] Output() default "<no output>";
    String [] Attr() default "<no input>";
    String Doc() default "<no doc>";
}
