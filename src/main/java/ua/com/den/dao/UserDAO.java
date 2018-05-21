package ua.com.den.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.den.entity.User;

import java.util.List;

public interface UserDAO extends JpaRepository <User, Integer> {
    List<User> findAllByEmail (String email);
}
