package com.ty.lms.dto;

import com.ty.lms.entities.Role;
import lombok.Data;

@Data
public class UserDTO {
	private int userId;

	private String username;

	private String password;

	private String userEmail;

	private Role role;

}
