package com.example.testapp;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

	@GetMapping("/")
    public String index() {
        return "index.html";
    }
}


