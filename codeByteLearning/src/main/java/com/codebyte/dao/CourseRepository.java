package com.codebyte.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codebyte.dtos.CourseDTO;
import com.codebyte.entities.Courses;

public interface CourseRepository  extends JpaRepository<Courses, Integer> {


}
