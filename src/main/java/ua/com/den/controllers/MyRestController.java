package ua.com.den.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.com.den.entity.User;
import ua.com.den.service.UserService;

import java.util.List;

@RestController
public class MyRestController {

    @Autowired
    private UserService userService;


    @GetMapping ("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @PostMapping  ("/saveUserRest")
    public boolean saveUserRest (@RequestBody User user){
        userService.save(user);
        return true;
    }

    @RequestMapping (value = "/save/{xxx}")
    public boolean save(@PathVariable("xxx") String email){
        User user=new User();
        user.setEmail(email);
        userService.save(user);
        return true;
    }



}
