package com.aireco.controller;

import com.aireco.model.Feedback;
import com.aireco.repository.FeedbackRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FeedbackController {

    private final FeedbackRepository feedbackRepository;

    // Constructor Injection
    public FeedbackController(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    // 📄 Load Feedback Page
    @GetMapping("/feedback-page")
    public String showFeedbackPage() {
        return "feedback"; // feedback.html
    }

    // 💾 Save Feedback to Database
    @PostMapping("/feedback")
    public String saveFeedback(@RequestParam("message") String message,
                               @RequestParam("rating") int rating) {

        Feedback feedback = new Feedback();
        feedback.setMessage(message);
        feedback.setRating(rating);

        feedbackRepository.save(feedback);

        // redirect after submit
        return "redirect:/";
    }
}