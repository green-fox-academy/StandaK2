package com.greenfox.standak2.bankofsimba.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankAccountList {

    public List<BankAccount> bankAccountList;

    public BankAccountList() {
        this.bankAccountList = new ArrayList<>();
                this.bankAccountList.add(new BankAccount("Simba", 2000, "Lion", true));
                this.bankAccountList.add(new BankAccount("Scar", 4500, "Lion", true));
                this.bankAccountList.add(new BankAccount("Pumbaa", 1200, "Wild Pig", true));
                this.bankAccountList.add(new BankAccount("Timon", 800, "Surikata", true));
                this.bankAccountList.add(new BankAccount("Shenzi", 310, "Hyena", false));
    }

    public List<BankAccount> getBankAccountList() {
        return this.bankAccountList;
    }

    public BankAccount getBankAccount(int index) {
        return this.bankAccountList.get(index);
    }

    public void raiseTheBalance(int id){
        System.out.println("raise: " + id);
        for (BankAccount bankAccount: this.bankAccountList) {
            if(bankAccount.getId() == id){
                bankAccount.raiseTheBalance();
                System.out.println(bankAccount.getBalance());
            }
        }
    }

        public void raiseTheBalanceNew(BankAccount account){
                    System.out.println(account.getId());
                    account.raiseTheBalance();
                    System.out.println(account.getBalance());
                }

//        bankAccountList.stream()
//                //.map(bankAccount -> bankAccount.getId())
//                .filter(bankAccount -> bankAccount.getId()==id)
//                .forEach(bankAccount -> bankAccount.raiseTheBalance());

    public void addBankAccount(BankAccount newAccount){
        this.bankAccountList.add(newAccount);
    }
}
