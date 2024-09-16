package orderHistory.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class HankakuValidator implements ConstraintValidator<Hankaku, String> {

    private static final String Hankaku_PATTERN = "[ -~]+";

    @Override
    public void initialize(Hankaku constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // nullは別のアノテーションでチェックする
        }
        boolean isValid = value.matches(Hankaku_PATTERN);
        if (!isValid) {
            context.disableDefaultConstraintViolation();
            String messageTemplate = context.getDefaultConstraintMessageTemplate();
          context.buildConstraintViolationWithTemplate(messageTemplate).addConstraintViolation();
        }
        return isValid;
    }
}
