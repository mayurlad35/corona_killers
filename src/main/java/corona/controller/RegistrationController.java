package corona.controller;

import corona.model.Customer;
import corona.service.CustomerServiceImpl;
import corona.validator.CustomerValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController
{
    @Autowired
    CustomerServiceImpl customerService;

    @Autowired
    CustomerValidator customerValidator;


    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(customerValidator);
    }
    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    /*----------------------Registration---------------------*/

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String cutomerRegistration(Model model)
    {
        logger.info("inside customerRegistration Method in RegistrationController class");
        model.addAttribute("custom",new Customer());
        return "register";
    }

    /* Post method for signup Data */
    @RequestMapping(value="/saveCustomer",method = RequestMethod.POST)
    public String customerSaveData(@ModelAttribute("custom") @Validated Customer customer, BindingResult result, Model model) {
        if (result.hasErrors()) {

            return "register";

        } else {

            boolean aBoolean = customerService.registerCustomer(customer);
            model.addAttribute("reg", aBoolean);
            return "registerSuccessMsg";

        }
    }

}
