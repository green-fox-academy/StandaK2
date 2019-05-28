package com.greenfox.listingtodosh2.controllers;

import com.greenfox.listingtodosh2.models.Todo;
import com.greenfox.listingtodosh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    @Autowired
    private TodoRepository repo;

    @GetMapping (value = {"", "/list"})
    public String list(Model model){
        model.addAttribute("todos", repo.findAll());
        return "todolist";
    }
}
