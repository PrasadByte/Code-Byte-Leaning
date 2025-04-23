package com.codebyte.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {
	private int id;
    private String title;
    private String description;
    private String youtubeLink;
    private String category;
}
