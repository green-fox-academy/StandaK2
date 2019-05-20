package com.greenfox.standak2.bankofsimba.models;

import java.util.Arrays;
import java.util.List;

public class BankAccountList {

    List<BankAccount> bankAccountList;

    public BankAccountList() {
        this.bankAccountList = Arrays.asList(
                new BankAccount("Simba", 2000, "Lion"),
                new BankAccount("Scar", 4500, "Lion"),
                new BankAccount("Pumbaa", 1200, "Wild Pig"),
                new BankAccount("Timon", 800, "Surikata"),
                new BankAccount("Shenzi", 310, "Hyena"));
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }
}
