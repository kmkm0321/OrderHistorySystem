package orderHistory.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NumberCheckValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NumberCheck {
    String message() default "{M003}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
