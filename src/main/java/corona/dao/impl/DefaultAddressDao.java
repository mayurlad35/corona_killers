package corona.dao.impl;

import corona.dao.AddressDao;
import corona.model.AddressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

public class DefaultAddressDao implements AddressDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int saveAddress(AddressModel addressModel) throws DataAccessException {
        int COUNT;
        try {

            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO address(first_name,last_name,address_line1,address_line2,postcode,email,contact_number)");
            query.append("values ( '"+addressModel.getFirstName()+"','"+addressModel.getLastName()+"','");
            query.append(addressModel.getAddressLine1()+"','"+addressModel.getAddressLine2()+"','"+addressModel.getPostcode()+"','");
            query.append(addressModel.getEmail()+"','"+addressModel.getContactNumber()+"');");
            COUNT = jdbcTemplate.update(query.toString());
        }
        catch (DataAccessException e){
            COUNT = 0;
        }

        return COUNT;

    }

}
