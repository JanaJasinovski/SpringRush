package com.example.springRush.controller;

import com.example.springRush.service.LoggedUserManagementService;
import com.example.springRush.service.LoginCountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    @GetMapping("/main")
    public String home(
            @RequestParam(required = false) String Logout,
            Model model
    ) {
        if (Logout != null) {
            loggedUserManagementService.setUsername(null);
        }
        String username = loggedUserManagementService.getUsername();
        int count = loginCountService.getCount();
        if (username == null) {
            return "redirect:/";
        }
        model.addAttribute("username" , username);
        model.addAttribute("loginCount", count);
        return "main";
    }
}