package com.greenfox.error.model.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import com.greenfox.error.model.service.UserService;
import com.greenfox.error.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
//@RequestMapping("/app")
public class AppController {

    @Autowired
    UserService service;

    @GetMapping({"/", "/app"})
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("yolo", service.getAll());
        return "main";
    }

    @PostMapping("/app")
    public String create(@ModelAttribute User newUser) {
        service.save(newUser);
        return "redirect:/app";
    }
}