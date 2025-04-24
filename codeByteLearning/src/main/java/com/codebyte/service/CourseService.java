package com.codebyte.service;

import java.util.List;

import com.codebyte.entities.Courses;




public interface CourseService {
	
	// add a new course
 Courses addCourse(Courses course);
 	// delete a course
 	Courses deleteCourse(int Id);
 	// update a course
 	Courses updateCourse(int courseId, Courses course);
 	// get all courses
 	List<Courses> getAllCourses();
 	// get course by id
 	Courses getCourseById(int courseId);
 	
    
}
