package corona.service;

import corona.model.AddressModel;
import org.springframework.validation.BindingResult;

public interface AddressService {

    String processAddressDetails(final AddressModel addressModel);
}
