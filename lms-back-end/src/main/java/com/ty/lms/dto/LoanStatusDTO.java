package com.ty.lms.dto;

import java.util.Date;

import lombok.Data;

@Data
public class LoanStatusDTO {
	private int StatusId;

	private String status;

	private String category;

	private String approverId;

	private Date approvedOn;

}
