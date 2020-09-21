package corona.dao;

import corona.model.AddressModel;

import java.security.Principal;
import java.util.List;

public interface ExistingAdressDao {
    public List<AddressModel> getUserToAddress(Principal principal);
    public int saveData(int address_id, Principal principal);
    public int getAddressId();
}
