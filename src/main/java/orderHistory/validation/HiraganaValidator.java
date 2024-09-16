package orderHistory.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class HiraganaValidator implements ConstraintValidator<Hiragana, String> {

    private static final String HIRAGANA_PATTERN = "^[\\u3040-\\u309F]+$";

    @Override
    public void initialize(Hiragana constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // nullは別のアノテーションでチェックする
        }
        boolean isValid = value.matches(HIRAGANA_PATTERN);
        if (!isValid) {
            context.disableDefaultConstraintViolation();
            String messageTemplate = context.getDefaultConstraintMessageTemplate();
          context.buildConstraintViolationWithTemplate(messageTemplate).addConstraintViolation();
        }
        return isValid;
    }
}
