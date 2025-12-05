package com.vircsam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public List<User> getUser() {
		return userRepository.findAll();
	}
	
	@GetMapping("/api/users/{id}")
	public User getUserById(@PathVariable Long id) throws Exception {
		Optional<User> otp = userRepository.findById(id);
		if(otp.isPresent()) {
			return otp.get();
		}
		
		throw new Exception("User not found with id: "+ id);
		
	}
}
