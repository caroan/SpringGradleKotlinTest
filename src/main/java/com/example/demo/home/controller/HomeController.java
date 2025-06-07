package com.example.demo.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String getHome() {
		String home = "/home/view/home";
		return home;
	}
}
