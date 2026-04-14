package com.aireco.controller;

import com.aireco.model.AiTool;
import com.aireco.service.RecommendationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ToolController {

    private final RecommendationService service;

    public ToolController(RecommendationService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/recommend")
    public String recommend(@RequestParam String query, Model model) {
        List<AiTool> tools = service.recommendTools(query);
        model.addAttribute("tools", tools);
        return "result";
    }
}