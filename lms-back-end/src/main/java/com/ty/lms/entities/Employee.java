package com.ty.lms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;

	// @Pattern(regexp = "/^[a-z ,.'-]+$/i\\n")
	@Column(name = "first_name")
	private String firstName;

	// @Pattern(regexp = "/^[a-z ,.'-]+$/i\\n")
	@Column(name = "last_name")
	private String lastName;

	@Valid
	@Column(name = "email", unique = true)
	private String email;

	private String designation;

	@JsonProperty
	@Column(name = "employee_status")
	private String employeeStatus;

}
