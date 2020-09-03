package corona.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

@Controller
public class AboutUsController {
Logger logger;
    @RequestMapping(value = "/aboutus",method = RequestMethod.GET)
    public String homepage() {

        return "aboutUs";
    }

}
