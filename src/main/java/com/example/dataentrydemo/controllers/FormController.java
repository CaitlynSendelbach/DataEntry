package com.example.dataentrydemo.controllers;

import com.example.dataentrydemo.models.Entry;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {

    // In-memory storage for entries
    private final List<Entry> entries = new ArrayList<>();

    // Display the form page to every user at base endpoint
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("entry", new Entry());
        return "form";
    }

    // Handle form submission and display confirmation page
    @PostMapping("/submit")
    public String submitForm(@Valid @ModelAttribute("entry") Entry entry,
                             BindingResult bindingResult,
                             Model model) {
        if (bindingResult.hasErrors()) {
            return "form";
        }
        entries.add(entry);
        model.addAttribute("entries", entries);
        return "confirmation";
    }
}
