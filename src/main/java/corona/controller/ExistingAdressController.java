package corona.controller;
import corona.model.AddressModel;
import corona.service.ExistingAdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.List;
@Controller
public class ExistingAdressController {
    @Autowired
    ExistingAdressService existingAdressService;
    @RequestMapping("/existaddress")

    public String userToAddress(Model model, Principal principal)
    {
       List<AddressModel> address= existingAdressService.getUserToAddressDetails(principal);
       model.addAttribute("list",address);
        System.out.println(address);
       return "existing_address";
    }

}
