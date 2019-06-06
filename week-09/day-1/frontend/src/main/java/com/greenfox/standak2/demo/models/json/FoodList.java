package com.greenfox.standak2.demo.models.json;

import java.util.List;

public class FoodList {


    private List<Food> foodList;

    public FoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public void addFood(Food food){
        this.foodList.add(food);


    }
}
