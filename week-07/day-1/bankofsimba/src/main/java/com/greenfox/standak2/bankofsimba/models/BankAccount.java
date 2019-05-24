package com.greenfox.standak2.bankofsimba.models;

import java.text.DecimalFormat;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    private boolean goodGuy;
    public static String currency = "Zebra";
    static int count = 0;
    private int id;


    public BankAccount() {

    }

    public BankAccount(String name, int balance, String animalType, boolean goodGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.id = count++;
        this.goodGuy = goodGuy;
    }

    public BankAccount(String name, int balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.id = count++;
        //this.goodGuy = false;
    }

    public void raiseTheBalance(){
        if (this.animalType.equals("Lion")) {
            this.balance += 100;
        } else {
            this.balance += 10;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isGoodGuy() {
        return goodGuy;
    }

    public int getId() {
        return id;
    }

}
