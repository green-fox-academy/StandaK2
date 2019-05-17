package com.webshop.webshop.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WebShop {

    private List<ShopItem> shopItemList;


    public WebShop(List<ShopItem> shopItemList) {
        this.shopItemList = shopItemList;

    }

    public List<ShopItem> getShopItemList() {
        return shopItemList;
    }

    public List<ShopItem> getListOnlyAvailable(){
        return this.shopItemList.stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
    }

    public List<ShopItem> getListContainString(){
        String word = "Nike";
        return this.shopItemList.stream()
                .filter(shopItem -> shopItem.getName().contains(word) || shopItem.getDescription().contains(word))
                .collect(Collectors.toList());
    }

    public List<ShopItem> getListCheapestFirst(){
        return this.shopItemList.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());
    }

    public double getAverageOfStock(){

        double average = this.shopItemList.stream()
                .map(shopItem -> shopItem.getQuantityOfStock())
                .collect(Collectors.averagingDouble(Integer::intValue));
        return average;
    }

    public String getMostExpensiveShopItem(){

        String name = this.shopItemList.stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .sorted(Comparator.comparing(ShopItem::getPrice).reversed())
                .limit(1)
                .map(shopItem -> shopItem.getName())
                .collect(Collectors.joining());
        return name;
    }

//    public String getMostExpensiveShopItem2(){
//
//        String name = this.shopItemList.stream()
//                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
//                .reduce(shopItem.getQuantityOfStock()::max)
//                .map(shopItem -> shopItem.getName())
//                .collect(Collectors.joining());
//        return name;
//    }
}
