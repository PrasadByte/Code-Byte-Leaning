package com.codebyte.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String role; // Role stored as a string for simplicity
    private List<CourseDTO> courses; // A list to hold a basic representation of courses
}