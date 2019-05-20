package com.greenfox.standak2.bankofsimba.controllers;

import com.greenfox.standak2.bankofsimba.models.BankAccount;
import com.greenfox.standak2.bankofsimba.models.BankAccountList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BankController {

    BankAccount myBankAccount = new BankAccount("Simba", 2000, "Lion");
    BankAccountList myBankAccountList = new BankAccountList();

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String showBankAccounts (Model model) {

        model.addAttribute("account", myBankAccount);
        return "index";
    }

    @RequestMapping(path = "/showlist", method = RequestMethod.GET)
    public String showListOfBankAccounts (Model model) {

        model.addAttribute("accountList", myBankAccountList);
        return "accountlist";
    }

    @RequestMapping(path = "/htmleception", method = RequestMethod.GET)
    public String htmlEception (Model model) {
        String myText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("myText", myText);
        return "htmleception";
    }


}
