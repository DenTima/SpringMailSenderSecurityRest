package ua.com.den.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ua.com.den.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.den.service.MailService;
import ua.com.den.service.UserService;

import javax.enterprise.inject.Model;
import java.io.File;
import java.io.IOException;
import java.security.Principal;

@Controller
public class MainController
{
    @Autowired
    private UserService userService;

    @Autowired
    private MailService mailService;


    @GetMapping("/")
    public String index (Principal principal) {
        System.out.println(principal);
        return "index";
}

    @PostMapping ("/saveUserWithAvatarAndSendEmail")
    public String saveUserWithAvatarAndSendEmail (User user, @RequestParam("file")MultipartFile file) throws IOException {
        file.transferTo(new File(
                System.getProperty("user.home") +
                        File.separator +
                        "pics" +
                        File.separator +
                        file.getOriginalFilename()
        ));

        user.setAvatar("/prefixForAva/" + file.getOriginalFilename());
        userService.save(user);
//        mailService.sendEmail(user);

        return "index";
    }

    @GetMapping ("/allUsers")
    public String allUsers (org.springframework.ui.Model model) {
        model.addAttribute("users", userService.findAll());
        return "allUsers";
    }

    @GetMapping ("/REST")
    public String rest(){
        return "rest";
    }



}
