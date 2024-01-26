package com.danial.spring.controller;


import com.danial.spring.model.User;
import com.danial.spring.service.UserService;
import com.danial.spring.service.UserServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


import java.util.List;

@Controller
public class HelloController {
    UserService userService = new UserServiceImp();

    @RequestMapping("/")
    public String indexView(Model model) {
        List<User> listUser = userService.getALL();
        model.addAttribute("users", listUser);
        return "index";
    }
}
