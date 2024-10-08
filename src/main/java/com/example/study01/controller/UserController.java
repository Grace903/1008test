package com.example.study01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.study01.domain.User;
import com.example.study01.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public String signup() {
		return "user/signup";
	}
	
	public String insertUser(User user) {
		userService.insertUser(user);
		
		return "redirect:/";
	}
	
	
	
	

}
