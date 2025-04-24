package com.codebyte.service;

public interface AdminService {
	// Method to add a new user
	void createAdmin(String username, String password, String role); // Add a new admin
    void deleteAdmin(String username); // Remove an admin
    void updateAdmin(String username, String newPassword, String newRole); // Update admin details

	

}
