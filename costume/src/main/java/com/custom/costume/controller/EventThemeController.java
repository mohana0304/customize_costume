package com.custom.costume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.custom.costume.EventTheme;
import com.custom.costume.EventThemeRepository;

@RestController
@RequestMapping("/api/themes")
@CrossOrigin(origins = "*")
public class EventThemeController {

    @Autowired
    private EventThemeRepository themeRepo;

    @PostMapping("/add")
    public String addTheme(@RequestBody EventTheme theme) {
        themeRepo.save(theme);
        return "Theme added successfully!";
    }

    @GetMapping("/list")
    public List<EventTheme> listThemes() {
        return themeRepo.findAll();
    }
}
