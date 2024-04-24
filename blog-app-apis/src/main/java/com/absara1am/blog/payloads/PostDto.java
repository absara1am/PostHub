package com.absara1am.blog.payloads;

import java.sql.Date;

import com.absara1am.blog.entities.Category;
import com.absara1am.blog.entities.User;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

	private Integer postId;

	@NotBlank(message = "Title is required")
	@Size(max = 100, message = "Title cannot exceed 100 characters")
	private String title;

	@NotBlank(message = "Content is required")
	private String content;

	private String imageName;

	@NotBlank(message = "Added date is required")
	private Date addedDate;

	@NotBlank(message = "Category is required")
	private CategoryDto category;

	@NotBlank(message = "User is required")
	private UserDto user;

}
