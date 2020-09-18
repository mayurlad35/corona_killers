package corona.controller;

import corona.vaccine.data.VaccineData;
import corona.vaccine.model.VaccineModel;
import corona.vaccine.service.VaccinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@SessionAttributes("command")
public class VaccinesController {
    @Autowired
    private VaccinesService vaccinesService;

    @RequestMapping(value = "/vaccines")
    public String vaccinesPage(Model model, @ModelAttribute("command") VaccineModel command){
        List<VaccineData> vaccinesList = vaccinesService.getAvailableVaccines();
        model.addAttribute("vaccines", vaccinesList);
        model.addAttribute("date",new Date());
        return "show_vaccines";
    }

    @RequestMapping(value = "/vaccines",method = RequestMethod.POST)
    public String proceedWithVaccine(HttpSession session, @ModelAttribute("command")VaccineModel command,
                                        Model model){
        List<VaccineData> vaccinesList = vaccinesService.getAvailableVaccines();
        model.addAttribute("vaccines", vaccinesList);
        model.addAttribute("date",new Date());
        model.addAttribute("next","Click next to fill Address Details");
        return "show_vaccines";
    }

    @ModelAttribute("command")
    public VaccineModel command(){
       return new VaccineModel();
    }
}
