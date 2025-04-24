package com.codebyte.service;

import java.util.List;

import com.codebyte.entities.User;

public interface UserService {
	public User createAdmin(User user);
	public User createUser(User user);
	public User createTrainer(User user);
	public List<User> findAllUsers();
	//get user by id
	public User findUserById(int userId);
	//update user
	public User updateUser(int userId, User user);
	//delete user
	public void deleteUser(int userId);

}	
