package com.codebyte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebyte.dao.CourseRepository;
import com.codebyte.dtos.CourseDTO;
import com.codebyte.entities.Courses;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Courses addCourse(Courses course) {
		
		return courseRepository.save(course);
	}

	@Override
	public Courses deleteCourse(int Id) {
		Courses course = courseRepository.findById(Id).orElse(null);
		if (course != null) {
			courseRepository.delete(course);
		}
		return course;
	}

	@Override
	public Courses updateCourse(int courseId, Courses course) {
		Courses existingCourse = courseRepository.findById(courseId).orElse(null);
		if (existingCourse != null) {
			existingCourse.setTitle(course.getTitle());
			existingCourse.setDescription(course.getDescription());
			existingCourse.setYoutubeLink(course.getYoutubeLink());
			existingCourse.setCategory(course.getCategory());
			existingCourse.setLearner(course.getLearner());
			return courseRepository.save(existingCourse);
		}
		return null;
		
	
	}

	@Override
	public List<Courses> getAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Courses getCourseById(int courseId) {
		
		Courses course = courseRepository.findById(courseId).orElse(null);
		if (course != null) {
			return course;
		}
		return null;
	}


}
