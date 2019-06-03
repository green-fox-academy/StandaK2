package com.greenfox.standak2.connectionwithmysql.controllers;

import com.greenfox.standak2.connectionwithmysql.models.Todo;
import com.greenfox.standak2.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    @Autowired
    private TodoRepository repo;

    @GetMapping ({"/", "/list"})
    public String list(@RequestParam(name="isActive", required=false) boolean isActive,
                       Model model){
        if(isActive){
            model.addAttribute("todos", repo.findAllByDone(false));
            model.addAttribute("active", true);
        } else{
            model.addAttribute("todos", repo.findAll());
            model.addAttribute("active", false);
        }
        return "todolist";
    }

    @GetMapping ({"/add"})
    public String addTodo(Model model){
        model.addAttribute("newTodo", new Todo());
        return "addTodo";
    }

    @PostMapping({"/add"})
    public String addTodo(@ModelAttribute Todo todo){
        repo.save(todo);
        return "redirect:/";
    }

    @GetMapping({"/{id}/delete"})
    public String deleteTodo(@PathVariable Long id){
        //System.out.println(todoToDelete.getTitle());
        repo.delete(repo.findById(id).get());
        return "redirect:/";
    }

    @GetMapping ({"/{id}/edit"})
    public String editTodo(@PathVariable Long id, Model model){
        model.addAttribute("todoForEdit", repo.findById(id).get());
        return "editTodo";
    }

    @PostMapping({"/edit"})
    public String editTodo(@ModelAttribute Todo todoAfterEdit){
        System.out.println(todoAfterEdit.getTitle());
        repo.save(todoAfterEdit);
        return "redirect:/";
    }
}
