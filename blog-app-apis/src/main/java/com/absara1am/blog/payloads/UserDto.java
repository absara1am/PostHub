package com.absara1am.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int userId;
	
	@NotEmpty(message = "Name is required")
	@Size(min  = 4, message = "Username must be min of 4 characters !!")
	private String name;
	
	@Email(message = "Invalid email address")
	private String email;
	
	@NotEmpty(message = "Password is required")
	@Size(min = 3, max = 10, message = "Password must be min of 3 chars and max of 10 chars !!")
	private String password;
	
	@NotEmpty(message = "About is required")
	private String about;

}
