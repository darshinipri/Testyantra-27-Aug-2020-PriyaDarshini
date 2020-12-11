package com.ty.lms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;


import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;

	@Column(name = "user_name", unique = true)
	private String username;

	//@Pattern(regexp = "^[a-zA-Z]\\w{3,14}$")
	private String password;

	@Valid
	@Column(name = "user_email", unique = true)
	private String userEmail;

	@ManyToOne
	@JoinColumn(name = "roleId", insertable = false, updatable = false)
	private Role role;

}
