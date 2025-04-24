package com.codebyte.service;

import com.codebyte.entities.User;

public interface UserService {
	public User createAdmin(User user);
	public User createUser(User user);
	public User createTrainer(User user);

}
