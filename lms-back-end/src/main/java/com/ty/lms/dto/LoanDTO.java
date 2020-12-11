package com.ty.lms.dto;

import java.util.List;
import com.ty.lms.entities.Client;
import com.ty.lms.entities.LoanType;
import com.ty.lms.entities.Overdueloan;
import com.ty.lms.entities.Payment;

import lombok.Data;

@Data
public class LoanDTO {
	private long loanId;

	private double loanAmount;

	private double emiAmount;

	private String collateralType;

	private String collateralValue;

	private int emi_duration;

	private int pending_emis;

	private LoanType loanType;

	private Client client;

	private List<Overdueloan> odloanlist;

	private List<Payment> payment;

}
