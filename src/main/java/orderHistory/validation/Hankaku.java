package orderHistory.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = HankakuValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Hankaku {
    String message() default "{M002}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
