package com.standak2.greenfox.hellobean.controllers;

import com.standak2.greenfox.hellobean.services.gfa.StudentServiceInterface;
import com.standak2.greenfox.hellobean.services.gfa.StudentServiceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenFoxAppController {

    @Autowired
    @Qualifier("file") StudentServiceInterface studentService;

    @GetMapping("/gfa")
    public String getListOfUtilities(Model model){
        model.addAttribute("count", studentService.count());
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

//    @GetMapping("/gfa/check")
//    public String checkStudent(@RequestParam String name){
//        studentService.checkStudent(name);
//        return "redirect:/gfa/save";
//    }

    @GetMapping("/gfa/save")
    public String addStudent(@RequestParam String name, Model model){
        if(studentService.checkStudent(name)) {
            model.addAttribute("check", studentService.checkStudent(name));
            return "gfaadd";
        } else {
            studentService.save(name);
            return "redirect:/gfa/list";
        }
    }
}
