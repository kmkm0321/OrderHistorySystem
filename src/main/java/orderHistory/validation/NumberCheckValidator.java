package orderHistory.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class NumberCheckValidator implements ConstraintValidator<NumberCheck, String> {

    private static final String Number_PATTERN = "[0-9０-９]+";

    @Override
    public void initialize(NumberCheck constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // nullは別のアノテーションでチェックする
        }
        boolean isValid = value.matches(Number_PATTERN);
        if (!isValid) {
            context.disableDefaultConstraintViolation();
            String messageTemplate = context.getDefaultConstraintMessageTemplate();
          context.buildConstraintViolationWithTemplate(messageTemplate).addConstraintViolation();
        }
        return isValid;
    }
}
