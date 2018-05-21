package ua.com.den.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.den.dao.UserDAO;
import ua.com.den.entity.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    public UserDAO userDAO;

    public void save(User user) {
        if (user!=null) userDAO.save(user);
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }
}
