package com.digital.pr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
    @GetMapping
    public String getIndex(Map<String, Object> model) {
        return "main";
    }

    @PostMapping("/greeting")
    public String postGreetings(
            @RequestParam(name="name", required = false, defaultValue = "Someone") String name,
            Map<String, Object> model) {
        model.put("name", name);
        return "greetings";
    }
}
