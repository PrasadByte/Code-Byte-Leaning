package com.codebyte.dto;

import lombok.Data;

@Data
public class CourseDTO {
	private int id;
    private String name;
    private String description;
    private String duration;
    private String language;
    private String category;
    private String videoUrl;
    private String instructorName;
}
