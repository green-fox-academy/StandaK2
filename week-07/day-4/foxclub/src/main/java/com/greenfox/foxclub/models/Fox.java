package com.greenfox.foxclub.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Fox {

    private String name;
    private List<String> trickList;
    private List<String> foodList;
    private List<String> drinkList;
    private String actualFood;
    private String actualDrink;

    public Fox(String name, String food, String drink, String trick) {
        this.name = name;
        this.trickList = splitStringByCommaToList(trick);
        this.foodList = splitStringByCommaToList(food);
        this.drinkList = splitStringByCommaToList(drink);
//        this.actualDrink = this.drinkList.get(0);
//        this.actualFood = this.foodList.get(0);
    }

    public Fox() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTrickList() {
        return trickList;
    }

    public List<String> getFoodList() {
        return foodList;
    }

    public List<String> getDrinkList() {
        return drinkList;
    }

    public void addTrick(String trick){
        System.out.println(trick);
        this.trickList.addAll(splitStringByCommaToList(trick));
    }

    public void addFood(String food){
        System.out.println(food);
        this.foodList.addAll(splitStringByCommaToList(food));
    }

    public void addDrink(String drink){
        System.out.println(drink);
        this.drinkList.addAll(splitStringByCommaToList(drink));
    }

    public void setActualFood(String actualFood) {
        this.actualFood = actualFood;
    }

    public void setActualDrink(String actualDrink) {
        this.actualDrink = actualDrink;
    }

    public int getTrickCount(){
        return this.trickList.size();
    }

    public String getActualFood() {
        return actualFood;
    }

    public String getActualDrink() {
        return actualDrink;
    }

    public void setTrickList(List<String> trickList) {
        this.trickList = trickList;
    }

    public void setFoodList(List<String> foodList) {
        this.foodList = foodList;
    }

    public void setDrinkList(List<String> drinkList) {
        this.drinkList = drinkList;
    }


    public List<String> splitStringByCommaToList(String text){
        List<String> newList = new ArrayList<>();
        Collections.addAll(newList, text.split(", "));
        return newList;
    }

}
