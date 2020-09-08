package corona.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.time.LocalDateTime;

@Controller
public class HomeController {

    private static Logger logger = LoggerFactory.getLogger(HomeController.class);
    @RequestMapping( value = "/",method = RequestMethod.GET)
    public String homepage(Model model) {
        model.addAttribute("message", "welcome to corona fighter's club");

        logger.info("inside home controller");
        model.addAttribute("message1", "welcome to homepage");

        return "homepage";
    }




    @RequestMapping("/getSessionValue")
    public String sessionValue(HttpSession httpSession , Principal principal){
            String sessionValue=principal.getName();
            httpSession.setAttribute("value", sessionValue);
            return "sessionValue";
        }
    }
    


