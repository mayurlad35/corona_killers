package corona.service;

import corona.controller.HomeController;
import corona.dao.CustomerDaoImpl;
import corona.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDaoImpl customerDao;
    private static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Override
    public boolean registerCustomer(Customer customer) {

        logger.info("inside registerCustomer method in CustomerServiceImpl method");

        int count = 0;
        count = customerDao.registerCustomer(customer);
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }
}