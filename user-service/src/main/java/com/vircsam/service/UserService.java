package com.vircsam.service;

import java.util.List;

import com.vircsam.exception.UserException;
import com.vircsam.model.User;


public interface UserService {
	
	User createUser(User user);
	List<User> getAllUsers();
	User getUserById(Long id) throws UserException;
	User updateUser(User user, Long id) throws UserException;
	void deleteUser(Long id) throws UserException;
}
