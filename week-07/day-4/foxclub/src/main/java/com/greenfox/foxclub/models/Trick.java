package com.greenfox.foxclub.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("trick")
public class Trick implements PetElement {

    String trickName;

    public Trick(String trickName) {
        this.trickName = trickName;
    }

    public Trick() {
    }

    @Override
    public String getName() {
        return trickName;
    }
}
