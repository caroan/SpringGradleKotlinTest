package com.example.demo.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String getHome() {
		String home = "/home/view/home";
		System.out.println("카카오톡에 'caroan github 비빌번호' 이름으로 비밀번호 있으니 찾아볼 것");
		return home;
	}
}
