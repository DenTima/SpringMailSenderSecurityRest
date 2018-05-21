package ua.com.den.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ua.com.den.entity.Customer;

public interface CustomerService extends UserDetailsService{
    void save(Customer customer);
}
