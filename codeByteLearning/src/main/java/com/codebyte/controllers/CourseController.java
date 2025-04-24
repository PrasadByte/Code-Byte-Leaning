package com.codebyte.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebyte.entities.Courses;
import com.codebyte.service.CourseService;


@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    
    @PostMapping("/add")
    public ResponseEntity<Courses> addCourse(@RequestBody Courses course) {
		Courses savedCourse = courseService.addCourse(course);
		return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);
	}
    @GetMapping("/getAll")
    public ResponseEntity<List<Courses>> getAllCourses() {
    			List<Courses> courses = courseService.getAllCourses();
    					return new ResponseEntity<>(courses, HttpStatus.OK);
    }
    @GetMapping("/getById")
    public ResponseEntity<Courses> getCourseById(@RequestBody int courseId) {
    	Courses course = courseService.getCourseById(courseId);
    	if (course != null) {
			return new ResponseEntity<>(course, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
    }
    @PutMapping("/update")
    public ResponseEntity<Courses> updateCourse(@RequestBody int courseId, @RequestBody Courses course) {
		Courses updatedCourse = courseService.updateCourse(courseId, course);
		if (updatedCourse != null) {
			return new ResponseEntity<>(updatedCourse, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
    }
}
