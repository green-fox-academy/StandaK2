package com.webshop.webshop;

import com.webshop.webshop.models.ShopItem;
import com.webshop.webshop.models.WebShop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class WebshopApplication {

//    private static WebShop myWebShop = new WebShop(new ArrayList<>(Arrays.asList(
//            new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5),
//            new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2),
//            new ShopItem("Coca-cola", "0.5 l standard coke", 25, 0),
//            new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100),
//            new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1))));

    public static void main(String[] args) {
        SpringApplication.run(WebshopApplication.class, args);

    }

}
