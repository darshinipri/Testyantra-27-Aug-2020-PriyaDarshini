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
@Table(name = "payments")

public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentId;

	@Column(name = "amount_paid")
	private double amountPaid;

	@ManyToOne
	@JoinColumn(name = "loanId", updatable = false, insertable = false)
	private Loan loan;

	@DateTimeFormat
	private Date paidOn;

	private double fines;

}
