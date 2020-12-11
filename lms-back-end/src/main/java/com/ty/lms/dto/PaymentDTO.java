package com.ty.lms.dto;

import java.util.Date;
import com.ty.lms.entities.Loan;
import lombok.Data;

@Data
public class PaymentDTO {
	private int paymentId;

	private double amountPaid;

	private Loan loan;

	private Date paidOn;

	private double fines;

}
