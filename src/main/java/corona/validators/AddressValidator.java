package corona.validators;

import corona.model.AddressModel;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;


public class AddressValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }

    @Override
    public void validate(Object o, Errors errors) {
        AddressModel model = (AddressModel) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"firstName","firstName.empty","first name caanot be null");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"lastName","lastName.empty","Last name should not be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"addressLine1","addressline1.empty","Address should not be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"email","email.empty","email should not be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"postcode","postalcode.empty","postcode should not be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"contactNumber","contact.empty","contact number should not be empty");
        validateEmail(model.getEmail(),errors);
        validateContactNumber(model.getContactNumber(),errors);
        validatePostCode(model.getPostcode(),errors);
    }

    public void validateEmail(final String email, Errors errors){
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                Pattern.CASE_INSENSITIVE);
        if (email!=null && !(pattern.matcher(email).matches())) {
            errors.rejectValue("email", "invalid.email");
        }
    }

    public void validateContactNumber(final String contactNumber, Errors errors){
        Pattern pattern = Pattern.compile("^\\d{10}$");
        if(contactNumber!=null && !pattern.matcher(contactNumber).matches()){
            errors.rejectValue("contactNumber", "enter.valid.contactNumber");
        }

    }

    public void validatePostCode(final String postcode, Errors errors){
        Pattern pattern = Pattern.compile("^\\d{6}$");
        if(postcode!=null && !pattern.matcher(postcode).matches()){
            errors.rejectValue("postcode","enter.valid.postcode");
        }
    }

}
