package com.greenfox.foxclub.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("food")
public class Food implements PetElement{

    String foodName;

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public Food() {
    }

    @Override
    public String getName() {
        return foodName;
    }
}