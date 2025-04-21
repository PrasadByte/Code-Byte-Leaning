package com.codebyte.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebyte.entities.Trainer;

public interface Trainerdao extends JpaRepository<Trainer, Integer> {
	// Custom query methods can be defined here if needed
	// For example, findByEmail(String email) to find a trainer by their email

}
