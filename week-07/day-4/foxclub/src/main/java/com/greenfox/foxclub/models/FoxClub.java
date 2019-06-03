package com.greenfox.foxclub.models;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxClub {

    private List<Fox> foxClub;

    public FoxClub() {
        this.foxClub = new ArrayList<>();
       // this.foxClub.add(new Fox("Persy", new ArrayList<>().as("water", "milk")), List<String> drinkList, List<String> trickList))
    }

    public List<Fox> getFoxClub() {
        return foxClub;
    }

    public Fox getFoxByName(String name){
        for (Fox fox : foxClub) {
            if (fox.getName().equals(name)) {
                return fox;
            }
        } return null;
    }

    public void addFox(Fox fox){
        foxClub.add(fox);
    }

}
