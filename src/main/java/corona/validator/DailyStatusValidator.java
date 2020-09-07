package corona.validator;

import corona.model.DailyStatusModel;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class DailyStatusValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return DailyStatusModel.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "activeCases", "dailyStatusModel.activeCases.empty");
        ValidationUtils.rejectIfEmpty(errors, "totalRecovered", "dailyStatusModel.totalRecovered.empty");
        ValidationUtils.rejectIfEmpty(errors, "totalDeaths", "dailyStatusModel.totalDeaths.empty");
        ValidationUtils.rejectIfEmpty(errors, "newCases", "dailyStatusModel.newCases.empty");
        ValidationUtils.rejectIfEmpty(errors, "totalCases", "dailyStatusModel.totalCases.empty");

        DailyStatusModel statusModel = (DailyStatusModel) o;

    }
}
