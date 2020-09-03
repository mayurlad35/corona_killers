package corona.controller;

import corona.model.AddressModel;
import corona.service.AddressService;
import corona.service.impl.DefaultAddressService;
import corona.validators.AddressValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeliveryPageController {

    @Autowired
    private AddressValidator addressValidator;

    @Autowired
    private AddressService addressService;


    @RequestMapping(value = "/delivery",method = RequestMethod.GET)
    public ModelAndView getDeliveryPage(ModelAndView modelAndView){
        modelAndView.addObject("address", new AddressModel());
        modelAndView.setViewName("addressform");
        return modelAndView;
    }


    @RequestMapping(value = "/addDeliveryAddress",method = RequestMethod.POST)
    public String addDeliveryAddress(@ModelAttribute("address") final  AddressModel addressModel, final BindingResult bindingResult, Model model){
        System.out.println(addressModel.getEmail());
        addressValidator.validate(addressModel,bindingResult);
        if(bindingResult.hasErrors()){
            model.addAttribute("address",addressModel);
        }
        model.addAttribute("msg",addressService.processAddressDetails(addressModel));
        model.addAttribute("address",new AddressModel());
        return "addressform";
    }


}
