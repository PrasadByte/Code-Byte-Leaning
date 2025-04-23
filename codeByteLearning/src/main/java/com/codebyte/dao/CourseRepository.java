package com.codebyte.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebyte.entities.courses;

public interface CourseRepository  extends JpaRepository<courses, Integer> {
	// Custom query methods can be defined here if needed
	// For example, to find courses by title:
	// List<Course> findByTitleContaining(String title);

}
