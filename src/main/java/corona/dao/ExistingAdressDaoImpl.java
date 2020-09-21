package corona.dao;

import corona.model.AddressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.security.Principal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ExistingAdressDaoImpl  implements ExistingAdressDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int saveData(int address_id, Principal principal) {
        String sql="insert into usertoaddress(customer_id,address_id) values ('" + principal.getName() + "','" + address_id+ "')";
        System.out.println(sql);
        return jdbcTemplate.update(sql);
    }

    @Override
    public List<AddressModel> getUserToAddress(Principal principal) {

        String query="SELECT address.first_name, address.address_line1, address.postcode FROM address INNER JOIN usertoaddress ON address.address_id=usertoaddress.address_id AND usertoaddress.customer_id='"+principal.getName()+"'";
        List<AddressModel> list= jdbcTemplate.query(query, new RowMapper<AddressModel>() {
            @Override
            public AddressModel mapRow(ResultSet resultSet, int i) throws SQLException {
                AddressModel addressModel=new AddressModel();
                addressModel.setFirstName(resultSet.getString("first_name"));
                addressModel.setAddressLine1(resultSet.getString("address_line1"));
                addressModel.setPostcode(resultSet.getString("postcode"));

                return addressModel;
            }
        });
        return list;
    }
    @Override
    public int  getAddressId() {
        String sql="select count(address_id) from address";
        int count =jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }
}
