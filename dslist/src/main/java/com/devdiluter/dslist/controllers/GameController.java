package com.devdiluter.dslist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @GetMapping("/")
    public String home() {
        return "API do DSList funcionando!";
    }
}

