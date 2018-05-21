package ua.com.den.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.den.entity.Customer;

public interface CustomerDAO extends JpaRepository <Customer, Integer> {

    Customer findCustomerByUsername (String username);


}
