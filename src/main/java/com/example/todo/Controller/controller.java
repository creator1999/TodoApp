package com.example.todo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class controller {

    @RequestMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model) {
        // Simple validation, replace with your actual authentication logic
        if ("Sherry".equals(username) && "Sherry123".equals(password)) {
            model.addAttribute("Welcome to Pranay Land Sherry", "Login successful!");
            return "submit";
        } else {
            model.addAttribute("error", "Invalid credentials. Please try again.");
            return "login";
        }
    }
}
