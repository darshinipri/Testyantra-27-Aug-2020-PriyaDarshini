package com.ty.lms.dao;

import com.ty.lms.entities.Client;
import com.ty.lms.entities.Loan;

import com.ty.lms.entities.Payment;

public interface ClientDAO {

	public Loan getLoanDetails(long loanId);

	public Client getClient(int clientId);

	public Payment makePayment(Payment payment);

	public Payment getPayment(long paymentId);

}
