package com.ty.lms.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "overdueLoan")
public class Overdueloan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int overDueLoanId;

	@Column(name = "overdue_peroid")
	private int overduePeriod;

	@ManyToOne
	@JoinColumn(name = "Loan_id", referencedColumnName = "loanId", insertable = false, updatable = false)
	private Loan loan;

	@Column(name = "priority")
	private String priority;

	@DateTimeFormat
	@Column(name = "due_date")
	private Date dueDate;

}
