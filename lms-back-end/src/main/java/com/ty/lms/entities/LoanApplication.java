package com.ty.lms.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
@Entity
@Table(name = "loan_applications")

public class LoanApplication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int applicationId;

	//@Pattern(regexp = "/^[a-z ,.'-]+$/i\\n")
	@Column(name = "first_name")
	private String firstName;

	//@Pattern(regexp = "/^[a-z ,.'-]+$/i\\n")
	@Column(name = "middle_name")
	private String middleName;

	//@Pattern(regexp = "/^[a-z ,.'-]+$/i\\n")
	@Column(name = "last_name")
	private String lastName;

	@NotNull
	private String gender;

	@Past
	private Date dob;

	//@Pattern(regexp = "^[#.0-9a-zA-Z\\s,-]+$\n")
	@Column(name = "address_1")
	private String address1;

	@Column(name = "address_2")
	private String address2;

	//@Pattern(regexp = "/^[a-zA-Z ]*$/")
	private String state;

	//@Pattern(regexp = "/^[a-zA-Z ]*$/")
	private String city;

	//@Pattern(regexp = "^[0-9]{6,6}$")
	private int pincode;

	@NotNull
	@Column(name = "applicant_job")
	private String applicantJob;

	@NotNull
	@Column(name = "applicant_salary")
	private String applicantsalary;

	//@Pattern(regexp = "/^(\\+\\d{1,3}[- ]?)?\\d{10}$/")
	@Column(name = "mobile_no")
	private Long mobileNo;

	@NotNull
	@Column(name = "identity_type")
	private String identityType;

	@NotNull
	@Column(name = "identity_no")
	private int identityNo;

	//@Pattern(regexp = "/[a-z]{3}[cphfatblj][a-z]\\d{4}[a-z]/i")
	@Column(name = "pan_no")
	private String panNo;

	@OneToOne
	@JoinColumn(name = "Status")
	private LoanStatus status;

	@ManyToOne
	@JoinColumn(name = "loanTypeId",insertable = false, updatable = false)
	private LoanType loanType;


}
