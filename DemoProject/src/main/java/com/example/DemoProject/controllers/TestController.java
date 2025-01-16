package com.example.DemoProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class TestController {

	@GetMapping("/login")
	public String getLogin() {
		return "login successfull";
	}
}
