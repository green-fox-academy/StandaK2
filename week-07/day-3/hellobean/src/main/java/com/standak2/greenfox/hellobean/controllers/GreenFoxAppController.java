package com.standak2.greenfox.hellobean.controllers;

import com.standak2.greenfox.hellobean.models.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxAppController {

    @Autowired
    StudentService studentService;

    @GetMapping("/gfa")
    public String getListOfUtilities(){
        //model.addAttribute("color", utilityService.randomColor());
        return "gfa";
    }

    @GetMapping("/gfa/list")
    public String getListOfAllStudents(Model model){
        model.addAttribute("studentList", studentService.findAll());
        return "gfalist";
    }

    @GetMapping("/gfa/add")
    public String addStudent(Model model){
        model.addAttribute("studentList", studentService.findAll());
        return "gfaadd";
    }

    @GetMapping("/gfa/save")
    public String addStudent(@RequestParam String name){
        studentService.save(name);
        return "redirect:/gfa/list";
    }
}
