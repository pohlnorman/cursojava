package com.thymeleaf.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dashboard {
	@RequestMapping("/")
    public String index() {
        return "twotwo";
    }
}
