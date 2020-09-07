package corona.controller;

import corona.model.DailyStatusModel;
import corona.service.DailyStatusService;
import corona.validator.DailyStatusValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class DailyStatusController {
    @Autowired
    private DailyStatusService statusService;
    @Autowired
    private DailyStatusValidator dailyStatusValidator;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(dailyStatusValidator);
    }

    @RequestMapping(value = "/addStatusData",method = RequestMethod.GET)
    public String showStatusForm(Model model){
        DailyStatusModel statusModel = new DailyStatusModel();
        model.addAttribute("status",statusModel);
        return "dailyStatusForm";
    }

    @RequestMapping(value = "/saveStatus" , method = RequestMethod.POST)
    public String saveStatusData(@ModelAttribute("status") @Validated DailyStatusModel statusModel , BindingResult result, Model model){
        if(result.hasErrors()){
            return "dailyStatusForm";
        }
        String statusMsg = null;
        statusMsg = statusService.addingCoronaDailyStatus(statusModel);
        model.addAttribute("msg",statusMsg);
        return "statusAddedSuccess";
    }

    @RequestMapping(value = "/getDailyStatusData")
    public String showDailyStatus(Model model){
        List<DailyStatusModel> statusData = statusService.getDailyStatusData();
        DailyStatusModel closestDateRecord = statusService.getClosestDate();
        model.addAttribute("dailyStatus",statusData);
        model.addAttribute("closestData",closestDateRecord);
        return "displayDailyStatus";
    }

}
