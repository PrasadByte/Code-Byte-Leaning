package com.codebyte.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codebyte.entities.Users;
@Repository
public interface Userdao extends JpaRepository<Users, Integer> {
	// Custom query methods can be defined here if needed
	// For example, findByEmail(String email) to find a user by their email

}
