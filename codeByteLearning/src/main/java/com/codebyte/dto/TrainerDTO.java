package com.codebyte.dto;

import java.util.Set;

import lombok.Data;
@Data
public class TrainerDTO {
	 private int id;
	    private String name;
	    private String email;
	    private String phone;
	    private String expertise;
	    private String experience;
	    private Set<CourseDTO> courses;

}
