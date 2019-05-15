package com.greenfoxacademy.springstart.controlllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        Greeting myGreeting = new Greeting();
        String randomStyle = myGreeting.getRandomStyle();
        String randomHello = myGreeting.getRandomHello();
        AtomicLong id = myGreeting.getId();
        model.addAttribute("name", randomHello);
        model.addAttribute("style", randomStyle);
        model.addAttribute("id", id.toString());
        return "greeting";
    }
}
