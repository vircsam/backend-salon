package com.vircsam.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vircsam.exception.UserException;
import com.vircsam.model.User;
import com.vircsam.service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;



@RestController
@RequiredArgsConstructor
public class UserController {
	
	private UserService userService;
	
	
	@PostMapping("/api/users")
	public User createUser(@RequestBody @Valid User user) {
		
	}
	
	@GetMapping("/api/users")
	public List<User> getUser() {
		
	}
	
	@GetMapping("/api/users/{id}")
	public User getUserById(@PathVariable Long id) throws UserException {
		
		
	}
	
	
	@PutMapping("/api/users/{id}")
	public User updateUser(@RequestBody User user, @PathVariable Long id) throws Exception{
		
	}
	
	@DeleteMapping("/api/users/{id}")
	public String deleteUserById(@PathVariable Long id) throws UserException{
		
	}
	
	

}
