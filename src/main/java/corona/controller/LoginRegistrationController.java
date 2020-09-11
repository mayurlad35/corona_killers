package corona.controller;

import corona.model.Customer;
import corona.service.impl.CustomerServiceImpl;
import corona.validator.CustomerValidator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
public class LoginRegistrationController
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

    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public String cutomerRegistration(Model model)
    {
        logger.info("inside customerRegistration Method in RegistrationController class");
        model.addAttribute("custom",new Customer());
        return "register";
    }

    /* Post method  */
    @RequestMapping(value="/saveAction",method = RequestMethod.POST)
    public String customerSaveData(@ModelAttribute("custom") @Validated Customer customer, BindingResult result, Model model) {
        if (result.hasErrors()) {

            return "register";

        } else {

            String  str = customerService.registerCustomer(customer);
            model.addAttribute("msg", str);
            return "statusAddedSuccess";

        }
    }

    /*----------------------Login---------------------*/
    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }
    @RequestMapping(value="/loginError", method = RequestMethod.GET)
    public String loginError(Model model) {
        model.addAttribute("msg", "Sorry your username or password is not correct Try again");
        return "login";

    }
    @RequestMapping("/logOut")
    public String logout(Model model)
    {
        model.addAttribute("error", "You have logout successfully!!!!");
        return "login";
    }

    @RequestMapping("/checkLoggedInUserName")
    public String check(HttpSession httpSession,Principal principal)
    {
       String userName= principal.getName();
       httpSession.setAttribute("userName",userName);
        return "loggedInUser";
    }

}
