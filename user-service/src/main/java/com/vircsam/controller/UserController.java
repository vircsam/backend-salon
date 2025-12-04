package com.vircsam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vircsam.model.User;

@RestController
public class UserController {
	
	@GetMapping("/api/users")
	public User getUser() {
		User user = new User();
		user.setEmail("meerthika@gmail.com");
		user.setFullName("Meerthika");
		user.setPhone("934234523");
		user.setRole("Owner");
		
		return user;
	}
}
