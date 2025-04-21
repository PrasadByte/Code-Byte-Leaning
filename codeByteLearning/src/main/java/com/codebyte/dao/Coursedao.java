package com.codebyte.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codebyte.entities.Course;

@Repository
public interface Coursedao extends JpaRepository<Course, Integer> {
	// Custom query methods can be defined here if needed
	// For example, findByEmail(String email) to find a course by their email

}
