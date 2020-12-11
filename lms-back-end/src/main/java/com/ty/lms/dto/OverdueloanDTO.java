package com.ty.lms.dto;

import java.util.Date;
import com.ty.lms.entities.Loan;

import lombok.Data;

@Data
public class OverdueloanDTO {
	private int overDueLoanId;

	private int overduePeriod;

	private Loan loan;

	private String priority;

	private Date dueDate;

}
