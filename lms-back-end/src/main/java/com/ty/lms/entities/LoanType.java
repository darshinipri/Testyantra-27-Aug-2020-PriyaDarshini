package com.ty.lms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "loan_type")

public class LoanType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanTypeId;

	@Column(name = "loan_name")
	private String loanName;

	@Column(name = "interest_rate")
	private double interestRate;

	@Column(name = "bank_name")
	private String bankName;

}
