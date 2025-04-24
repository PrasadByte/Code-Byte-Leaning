package com.codebyte.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.codebyte.dao.UserRepository;
import com.codebyte.entities.Role;
import com.codebyte.entities.User;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User createAdmin(User user) {
		
		user.setRole(Role.ADMIN);
		return userRepository.save(user);
	}

	@Override
	public User createUser(User user) {
	
		user.setRole(Role.USER);
		return userRepository.save(user);
	
	}

	@Override
	public User createTrainer(User user) {

		user.setRole(Role.TRAINER);
		return userRepository.save(user);
	}


}
