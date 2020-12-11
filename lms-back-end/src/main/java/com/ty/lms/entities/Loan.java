package com.ty.lms.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Loan")
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loanId;

	@Column(name = "loan_amount")
	private double loanAmount;

	@Column(name = "emi_amount")
	private double emiAmount;

	@Column(name = "collateral_type")
	private String collateralType;

	@Column(name = "collateral_value")
	private String collateralValue;

	@Column(name = "emi_duration")
	private int emi_duration;

	@Column(name = "pending_emis")
	private int pending_emis;

	@ManyToOne
	@JoinColumn(name = "loanTypeId", insertable = false, updatable = false)
	private LoanType loanType;

	@ManyToOne
	@JoinColumn(name = "clientId", insertable = false, updatable = false)
	private Client client;
	

	@OneToMany(mappedBy = "loan")
	private List<Overdueloan> odloanlist;

	@OneToMany(mappedBy = "loan")
	private List<Payment> payment;

}
