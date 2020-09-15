package corona.validator;

import corona.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;

public class CustomerValidator implements Validator {


    @Override
    public boolean supports(Class<?> aClass) {
        return Customer.class.equals(aClass);
    }


    @Override
    public void validate(Object obj, Errors err) {

        ValidationUtils.rejectIfEmpty(err, "firstName", "customer.firstName.empty");
        ValidationUtils.rejectIfEmpty(err, "lastName", "customer.lastName.empty");
        ValidationUtils.rejectIfEmpty(err, "email", "customer.email.empty");
        ValidationUtils.rejectIfEmpty(err, "password", "customer.password.empty");
        ValidationUtils.rejectIfEmpty(err, "re_password", "customer.re_password.empty");

        ValidationUtils.rejectIfEmpty(err, "age", "customer.age.empty");
        ValidationUtils.rejectIfEmpty(err, "contact", "customer.contact.empty");

    }
}