package com.greenfox.foxclub.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("drink")
public class Drink implements PetElement{

    String drinkName;

    public Drink(String drinkName) {
        this.drinkName = drinkName;
    }

    public Drink() {
    }

    @Override
    public String getName() {
        return drinkName;
    }
}
