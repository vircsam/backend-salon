package com.vircsam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vircsam.model.User;
import com.vircsam.repository.UserRepository;



@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@PostMapping("/api/users")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
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
