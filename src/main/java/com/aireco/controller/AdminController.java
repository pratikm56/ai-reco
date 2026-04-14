package com.aireco.controller;


import com.aireco.model.AiTool;
import com.aireco.repository.AiToolRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final AiToolRepository repo;

    public AdminController(AiToolRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public String adminPage(Model model) {
        model.addAttribute("tools", repo.findAll());
        return "admin";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("tool", new AiTool());
        return "add-tool";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute AiTool tool) {
        repo.save(tool);
        return "redirect:/admin";
    }
}