package com.codebyte.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebyte.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	

}
