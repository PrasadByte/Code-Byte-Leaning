package com.codebyte.service;

public interface AuthService {
	 void registerUser(String username, String password);
	    boolean authenticateUser(String username, String password);
}
