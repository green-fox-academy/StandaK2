package com.greenfox.standak2.demo.models.json;

import java.time.LocalDateTime;

public class Food {

    private long id;
    private String name;
    private int amount;
    private LocalDateTime addedAt;

    public Food() {
    }

    public Food(String name, int amount) {
        this.name = name;
        this.amount = amount;

        this.addedAt = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDateTime getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(LocalDateTime addedAt) {
        this.addedAt = addedAt;
    }
}
