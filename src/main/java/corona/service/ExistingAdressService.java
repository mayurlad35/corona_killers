package corona.service;

import corona.model.AddressModel;

import java.security.Principal;
import java.util.List;

public interface ExistingAdressService {
    public List<AddressModel> getUserToAddressDetails(Principal principal);
    public int getAddress(AddressModel addressModel, Principal principal);
}
