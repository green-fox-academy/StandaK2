package com.standak2.greenfox.hellobean.controllers;

import com.standak2.greenfox.hellobean.services.printer.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PrinterController {

    @Autowired
    UtilityService utilityService;

    @GetMapping("/useful")
    public String getListOfUtilities() {
        //model.addAttribute("color", utilityService.randomColor());
        return "index";
    }

    @GetMapping("/useful/colored")
    public String getRandomBackground(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "randombackground";
    }

    @GetMapping("/useful/email")
    public String getEmailValidation(@RequestParam String email, Model model) {
        model.addAttribute("valid", utilityService.validateEmail(email));
        model.addAttribute("email", email);
        return "emailvalidation";
    }

    @GetMapping("/useful/caesar")
    public String CeasarDecode(@RequestParam String text, @RequestParam int number, Model model) {
        model.addAttribute("origtext", text);
        model.addAttribute("result", utilityService.caesar(text, number));
        return "ceasardecode";
    }
}
