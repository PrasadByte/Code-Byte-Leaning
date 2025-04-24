package com.codebyte.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebyte.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByEmail(String email);
	
	
	
	// Optional<User> findByRole(Role role); // Assuming you have a Role entity
}
