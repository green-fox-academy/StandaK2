package com.greenfox.foxclub;

import com.greenfox.foxclub.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoxclubApplication implements CommandLineRunner {

//    @Autowired
//    Fox myFox;

    public static void main(String[] args) {
        SpringApplication.run(FoxclubApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
//        myFox.addFood("Salad");
//        myFox.addFood("Carrot");
//        myFox.addFood("Muschrooms");
//        myFox.addDrink("Water");
//        myFox.addDrink("Beer");
//        myFox.addDrink("Milk");
    }
}
