package com.greenfox.foxclub.controllers;

import com.greenfox.foxclub.models.Fox;
import com.greenfox.foxclub.models.FoxClub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    FoxClub foxClub;


    @GetMapping("/")
    public String getInformationView(@RequestParam("name") String name, Model model) {
        Fox fox = foxClub.getFoxByName(name);
        model.addAttribute(fox);
//                model.addAttribute("name", name);
//                model.addAttribute("foodlist", fox.getFoodList());
//                model.addAttribute("tricklist", fox.getTrickList());
//                model.addAttribute("drinklist", fox.getDrinkList());
//                model.addAttribute("trickcount", fox.getTrickList().size());
                return "index";
    }

//    @PostMapping("/")
//    public String getInformationView(@RequestParam String name, Model model) {
//
//        Fox fox = foxClub.getFoxByName(name);
//        model.addAttribute(fox);
////                model.addAttribute("name", name);
////                model.addAttribute("foodlist", fox.getFoodList());
////                model.addAttribute("tricklist", fox.getTrickList());
////                model.addAttribute("drinklist", fox.getDrinkList());
////                model.addAttribute("trickcount", fox.getTrickList().size());
//        return "index";
//    }


    @GetMapping("/login")
    public String getLoginName() {
        return "login";
    }

    @PostMapping("/login")
    public String getLoginName(@RequestParam String name, RedirectAttributes redirectAttributes) {

            if (foxClub.getFoxByName(name) != null) {
                redirectAttributes.addAttribute("name", name);
                return "redirect:/";
            }
        return "redirect:/createuser";
    }

    @GetMapping("/createuser")
    public String createUser() {
        return "createuser";
    }
//
//    @GetMapping("/changeuser")
//    public String changeUser(@ModelAttribute Fox fox, Model model) {
//        model.addAttribute(fox);
//        model.addAttribute("foodString");
//        model.addAttribute("drinkString");
//        model.addAttribute("trickString");
//        return "changeuser";
//    }

    @PostMapping("/createuser")
    public String getLoginName(@RequestParam String name,
                               @RequestParam String food,
                               @RequestParam String drink,
                               @RequestParam String trick,
                               RedirectAttributes redirectAttributes) {

        foxClub.addFox(new Fox(name, food, drink, trick));

        redirectAttributes.addAttribute("name", name);
        return "redirect:/";
    }
}
