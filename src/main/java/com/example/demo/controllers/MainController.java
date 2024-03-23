package com.example.demo.controllers;

import com.example.demo.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private CourseService courseService;

    @Autowired
    public MainController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/")
    public String main(Model courses) {
        courses.addAttribute("courses", courseService.findAll());
        return "main";
    }
}
