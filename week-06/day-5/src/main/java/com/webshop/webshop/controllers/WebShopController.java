package com.webshop.webshop.controllers;

import com.webshop.webshop.models.ShopItem;
import com.webshop.webshop.models.WebShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class WebShopController {

    private WebShop myWebShop = new WebShop(new ArrayList<>(Arrays.asList(
            new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5),
            new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2),
            new ShopItem("Coca-cola", "0.5 l standard coke", 25, 0),
            new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100),
            new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1))));


    @RequestMapping("/webshop")
    public String webshop(Model model) {

        model.addAttribute("items", myWebShop.getShopItemList());
        return "index";
    }

    @RequestMapping("/webshop/only-available")
    public String getListOnlyAvailable(Model model) {

        model.addAttribute("items", myWebShop.getListOnlyAvailable());
        return "index";
    }

    @RequestMapping("/webshop/cheapest-first")
    public String getCheapestFirst  (Model model) {

        model.addAttribute("items", myWebShop.getListCheapestFirst());
        return "index";
    }

    @RequestMapping("/webshop/contains-nike")
    public String getListContainsString(Model model) {

        model.addAttribute("items", myWebShop.getListContainString());
        return "index";
    }

    @RequestMapping("/webshop/average-stock")
    public String getAverageStock(Model model) {

        model.addAttribute("average", myWebShop.getAverageOfStock());
        return "index";
    }

    @RequestMapping("/webshop/most-expensive")
    public String getMostExpensiveShopItem (Model model) {

        model.addAttribute("expensive", myWebShop.getMostExpensiveShopItem());
        return "index";
    }
}

