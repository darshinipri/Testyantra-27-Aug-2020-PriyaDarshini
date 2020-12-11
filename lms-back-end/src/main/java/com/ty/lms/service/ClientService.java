package com.ty.lms.service;

import com.ty.lms.entities.Client;
import com.ty.lms.entities.Loan;
import com.ty.lms.entities.Payment;

public interface ClientService {
	public Loan getLoanDetails(long loanId);

	public Client getClient(int clientId);

	public Payment makePayment(Payment payment);

	public Payment getPayment(long paymentId);

}
