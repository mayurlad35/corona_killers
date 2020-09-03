package corona.controller;

import corona.model.Customer;
import corona.service.CustomerServiceImpl;
import corona.validator.CustomerValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;


import java.security.Principal;

@Controller
@SessionAttributes("username")
public class LoginController
{
    private static Logger logger = LoggerFactory.getLogger(HomeController.class);
    //Login
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login()
    {
        return "login";
    }


    //Logout success Msg
    @RequestMapping("/logoutSuccess")
    public String logout()

    {
        return "logoutSuccessMsg";
    }


    //Login failed
    @RequestMapping(value="/loginError", method = RequestMethod.GET)
    public String loginError(Model model) {
             model.addAttribute("msg", "Sorry your username or password is not correct Try again");
        return "login";

    }

    //Access denied
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, Principal principal) {

        if (principal != null) {
            model.addAttribute("message", "Hi " + principal.getName()
                    + "<br> You don't have permission to access this page!");
        }
        return "403Page";
    }


    //Current logged in user data
    @RequestMapping(value = "/currentLoggedInUser",method = RequestMethod.GET)
    public String loggedInUserInfo(Model model, Principal principal)
    {

        String username=principal.getName();
        model.addAttribute("username",username);

        return "user";
    }


}
