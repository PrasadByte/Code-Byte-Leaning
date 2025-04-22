package com.codebyte.service;

import org.springframework.http.ResponseEntity;

import com.codebyte.dto.AdminDTO;
import com.codebyte.entities.Admin;

public interface AdminService {
	   // Method to add a new admin with ResponseEntity
    ResponseEntity<Admin> registerAdmin(AdminDTO admin);
	
	
}
