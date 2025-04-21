package com.codebyte.dto;

import java.util.List;

import lombok.Data;
@Data
public class UsersDTO {
	private int id;
    private String name;
    private String email;
    private String phone;
    private List<CourseDTO> courses;
}
