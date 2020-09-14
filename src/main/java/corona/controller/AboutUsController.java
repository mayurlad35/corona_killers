package corona.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/")
public class AboutUsController {
    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/aboutus",method = RequestMethod.GET)
    public String aboutUs() {
        logger.info("About Us page Execuited");
        return "aboutUs";
    }
}
