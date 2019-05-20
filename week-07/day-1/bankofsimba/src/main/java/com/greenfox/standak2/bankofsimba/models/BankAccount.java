package com.greenfox.standak2.bankofsimba.models;

import java.text.DecimalFormat;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    private String balanceString;
    DecimalFormat df = new DecimalFormat("#.00");
    public static String currency = "Zebra";

    public BankAccount(String name, int balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.balanceString = df.format(balance);
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

    public String getBalanceString() {
        return balanceString;
    }

    public void setBalanceString(String balanceString) {
        this.balanceString = balanceString;
    }
}
