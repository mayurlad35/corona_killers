package corona.dao.impl;

import corona.controller.HomeController;
import corona.dao.CustomerDao;
import corona.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Override
    public int registerCustomer(Customer customer)
    {
        logger.info("inside registerCustomer method in CustomerDaoImpl class");

        String role="ROLE_U";
        String registerQuery="insert into customer values('"+customer.getFirstName()+"','"+customer.getLastName()+"'," +
                "'"+customer.getEmail()+"','"+customer.getPassword()+"'," +
                "'"+customer.getRe_password()+"','"+customer.getAge()+"','"+customer.getContact()+"','"+role+"')";

        return jdbcTemplate.update(registerQuery);
    }
}
