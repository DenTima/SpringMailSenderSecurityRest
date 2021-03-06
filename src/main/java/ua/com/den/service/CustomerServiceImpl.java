package ua.com.den.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.den.dao.CustomerDAO;
import ua.com.den.entity.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDAO customerDAO;

    public void save(Customer customer) {
        customerDAO.save(customer);
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return customerDAO.findCustomerByUsername(username);
    }
}
