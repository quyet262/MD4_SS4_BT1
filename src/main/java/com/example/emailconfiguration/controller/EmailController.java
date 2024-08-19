package com.example.emailconfiguration.controller;

import com.example.emailconfiguration.model.Email;
import com.example.emailconfiguration.model.Languages;
import com.example.emailconfiguration.model.PageSize;
import com.example.emailconfiguration.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {
    @Autowired
    private EmailService emailService;

    @ModelAttribute("emails")
    public List<Email> getEmails() {
        return emailService.findAll();
    }

    @GetMapping("/email")
    public String email() {
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        List<String> languages = new ArrayList<>();
        languages.add("english");
        languages.add("vietnamese");
        languages.add("japanese");
        languages.add("chinese");
        List<Integer> pageSizes = new ArrayList<>();
        pageSizes.add(5);
        pageSizes.add(10);
        pageSizes.add(15);
        pageSizes.add(25);
        pageSizes.add(50);
        pageSizes.add(100);


    model.addAttribute("lang", languages);
    model.addAttribute("pageSizes", pageSizes);
    model.addAttribute("email", new Email());

        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("email") Email email) {
        emailService.addEmail(email);
        return "redirect:/email";
    }
}
