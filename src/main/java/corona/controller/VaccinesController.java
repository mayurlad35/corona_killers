package corona.controller;

import corona.vaccine.data.VaccineData;
import corona.vaccine.service.VaccinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
public class VaccinesController {
    @Autowired
    private VaccinesService vaccinesService;

    @RequestMapping(value = "/vaccines")
    public String vaccinesPage(Model model){
        List<VaccineData> vaccinesList = vaccinesService.getAvailableVaccines();
        model.addAttribute("vaccines", vaccinesList);
        model.addAttribute("date",new Date());
        return "show_vaccines";
    }
}
