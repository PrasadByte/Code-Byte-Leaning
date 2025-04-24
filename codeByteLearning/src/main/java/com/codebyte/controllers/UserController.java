package com.codebyte.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebyte.entities.User;
import com.codebyte.service.CustomUserDetailsService;
import com.codebyte.service.UserServiceImpl;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserServiceImpl userService;
	//create  Admin
	@PostMapping("/admin")
	public ResponseEntity<User> createAdmin(@RequestBody User user) {
		return ResponseEntity.ok(userService.createAdmin(user));
	}
	
	// create trainer
	@PostMapping("/trainer")
	public ResponseEntity<User> createTrainer(@RequestBody User user) {
		return ResponseEntity.ok(userService.createTrainer(user));
	}
	// create user
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		return ResponseEntity.ok(userService.createUser(user));
	}
	//get all users
	@PostMapping("/getAll")
	public ResponseEntity<List<User>> getAllUsers() {
		return ResponseEntity.ok(userService.findAllUsers());
	}
	//get User by id
	@PostMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable int userId) {
		return ResponseEntity.ok(userService.findUserById(userId));
	}
	
}
