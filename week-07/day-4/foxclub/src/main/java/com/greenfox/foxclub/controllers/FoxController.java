package com.greenfox.foxclub.controllers;

import com.greenfox.foxclub.models.Fox;
import com.greenfox.foxclub.models.FoxClub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class FoxController {

    @Autowired
    FoxClub foxClub;

    @GetMapping("/nutritionStore")
    public String nutritionStore(@RequestParam("name") String name, Model model) {
        System.out.println(foxClub);
        Fox fox = foxClub.getFoxByName(name);
        model.addAttribute(fox);
        return "nutritionstore";
    }

    @PostMapping("/nutritionStore")
    public String getValuesFromNutritionStore(@RequestParam String name,
                                              @RequestParam String food,
                                              @RequestParam String drink,
                                              RedirectAttributes redirectAttributes) {
        Fox fox = foxClub.getFoxByName(name);
        fox.setActualDrink(drink);
        fox.setActualFood(food);

        redirectAttributes.addAttribute("name", fox.getName());
        return "redirect:/";
    }

    @GetMapping("/trickCenter")
    public String trickCenter(@RequestParam("name") String name, Model model) {
        System.out.println(foxClub);
        Fox fox = foxClub.getFoxByName(name);
        model.addAttribute(fox);
        return "trickcenter";
    }

    @PostMapping("/trickCenter")
    public String getValuesFromTrickCenter(@RequestParam String name,
                                              @RequestParam String trick,
                                              RedirectAttributes redirectAttributes) {
        Fox fox = foxClub.getFoxByName(name);
        fox.addTrick(trick);

        redirectAttributes.addAttribute("name", fox.getName());
        return "redirect:/";
    }
}
