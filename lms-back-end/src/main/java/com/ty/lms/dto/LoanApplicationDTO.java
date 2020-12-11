package com.ty.lms.dto;

import java.util.Date;
import com.ty.lms.entities.LoanStatus;
import com.ty.lms.entities.LoanType;

import lombok.Data;

@Data
public class LoanApplicationDTO {
	private int applicationId;

	private String firstName;

	private String middleName;

	private String lastName;

	private String gender;

	private Date dob;

	private String address1;

	private String address2;

	private String state;

	private String city;

	private int pincode;

	private String applicantJob;

	private String applicantsalary;

	private Long mobileNo;

	private String identityType;

	private int identityNo;

	private String panNo;

	private LoanStatus status;

	private LoanType loanType;

}
