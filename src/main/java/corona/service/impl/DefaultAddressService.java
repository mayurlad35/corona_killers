package corona.service.impl;

import corona.dao.AddressDao;
import corona.dao.impl.DefaultAddressDao;
import corona.model.AddressModel;
import corona.service.AddressService;
import corona.validators.AddressValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.validation.BindingResult;

public class DefaultAddressService implements AddressService {



    @Autowired
    private AddressDao addressDao;


    @Override
    public String processAddressDetails(final AddressModel addressModel) {

        return addressDao.saveAddress(addressModel) > 0 ? "registration successfull" : "unable to register";

    }


}
