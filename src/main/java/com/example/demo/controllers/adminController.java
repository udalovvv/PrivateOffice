package com.example.demo.controllers;

import com.example.demo.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class adminController {

    CourseService courseService;

    @Autowired
    public adminController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/access")
    public String access() {
        return "";
    }

    @GetMapping("/redactor")
    public String coursesRedactor(Model courses) {
        courses.addAttribute("courses", courseService.findAll());
        return "admin";
    }

}
