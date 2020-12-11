package com.ty.lms.dto;

import lombok.Data;

@Data
public class LoanTypeDTO {
	private int loanTypeId;

	private String loanName;

	private double interestRate;

	private String bankName;

}
