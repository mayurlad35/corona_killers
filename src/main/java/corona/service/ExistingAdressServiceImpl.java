package corona.service;

import corona.dao.AddressDao;
import corona.dao.ExistingAdressDao;
import corona.model.AddressModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.Principal;
import java.util.List;

public class ExistingAdressServiceImpl implements ExistingAdressService {
    ExistingAdressDao existingAdressDao;
    @Autowired
    AddressDao address;

    public ExistingAdressDao getExistingAdressDao() {
        return existingAdressDao;
    }

    public void setExistingAdressDao(ExistingAdressDao existingAdressDao) {
        this.existingAdressDao = existingAdressDao;
    }

    @Override
    public int getAddress(AddressModel addressModel, Principal principal) {
            int i=address.saveAddress(addressModel);
            System.out.println(i+"service");
            int j=existingAdressDao.getAddressId();
            return getExistingAdressDao().saveData(j,principal);
    }

    @Override
    public List<AddressModel> getUserToAddressDetails(Principal principal) {
        return existingAdressDao.getUserToAddress(principal);
    }
}
