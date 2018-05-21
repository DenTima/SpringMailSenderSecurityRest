package ua.com.den.service;

import ua.com.den.entity.User;

import java.util.List;

public interface UserService {
    void save (User user);
    List<User> findAll();


}
