package corona.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping( value = "/homepage", method = RequestMethod.GET)
    public String homepage(Model model) {
        model.addAttribute("message", "welcome to corona fighter's club");
        return "homepage";
    }
}
