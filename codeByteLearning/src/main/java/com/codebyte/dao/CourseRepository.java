package com.codebyte.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebyte.dtos.CourseDTO;
import com.codebyte.entities.Courses;

public interface CourseRepository  extends JpaRepository<Courses, Integer> {

    public CourseDTO save(CourseDTO courseDTO);
	// Custom query methods can be defined here if needed
	// For example, to find courses by title:
	// List<Course> findByTitleContaining(String title);

}
