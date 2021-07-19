package com.norman.cadenas;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class homecontroller {
	
	@RequestMapping("")
	public String hello() {
		return "hola cliente";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Spring boot es genial";
	}
}
