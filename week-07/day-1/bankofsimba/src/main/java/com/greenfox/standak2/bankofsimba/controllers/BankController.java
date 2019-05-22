package com.greenfox.standak2.bankofsimba.controllers;

import com.greenfox.standak2.bankofsimba.models.BankAccount;
import com.greenfox.standak2.bankofsimba.models.BankAccountList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class BankController {

    BankAccountList myBankAccountList = new BankAccountList();

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String showBankAccounts (Model model) {

        model.addAttribute("myAccount", myBankAccountList.getBankAccount(0));
        return "index";
    }

    @RequestMapping(path = "/showlist", method = RequestMethod.GET)
    public String showListOfBankAccounts (Model model) {

        model.addAttribute("accountList", myBankAccountList.getBankAccountList());
        model.addAttribute("newAccount", new BankAccount());
//        model.addAttribute("specialAccount", new BankAccount());
        return "accountlist";
    }

    @RequestMapping(path = "/htmleception", method = RequestMethod.GET)
    public String htmlEception (Model model) {
        String myText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("myText", myText);
        return "htmleception";
    }

//    @RequestMapping(path = "/raise", method = RequestMethod.POST)
//    public String raiseTheBalance(@ModelAttribute(name="id") int id) {
//        System.out.println(id + "blabla");
//        myBankAccountList.raiseTheBalance(id);
//        //model.addAttribute("account", myBankAccountList.raiseTheBalance(bankAccount));
//        return "redirect:/showlist";
//    }

    @PostMapping("/raise")
    public String raiseTheBalance(@RequestParam("controllerRef") String accountId) {
        myBankAccountList.raiseTheBalance(Integer.parseInt(accountId));
        return ("redirect:showlist");
    }

    @PostMapping("/add")
    public String addAccount(@ModelAttribute(name="newAccount") BankAccount newAccount) {
        myBankAccountList.addBankAccount(newAccount);
        return ("redirect:showlist");
    }

    @PostMapping("/add2")
    public String addAccount2(@RequestParam String name, @RequestParam  int balance, @RequestParam String animalType, @RequestParam boolean goodGuy) {
        myBankAccountList.addBankAccount(new BankAccount(name, balance, animalType, goodGuy));
        return ("redirect:showlist");
    }




}
