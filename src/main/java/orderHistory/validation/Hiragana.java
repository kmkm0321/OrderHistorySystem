package orderHistory.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = HiraganaValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Hiragana {
    String message() default "{M001}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
