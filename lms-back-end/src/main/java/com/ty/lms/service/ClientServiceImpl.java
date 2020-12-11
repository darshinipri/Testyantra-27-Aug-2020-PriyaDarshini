package com.ty.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.lms.dao.ClientDAO;
import com.ty.lms.entities.Client;
import com.ty.lms.entities.Loan;
import com.ty.lms.entities.Payment;
import com.ty.lms.exceptions.LoanException;

@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	private ClientDAO clientdao;

	@Override
	public Loan getLoanDetails(long loanId) {
		Loan dto = clientdao.getLoanDetails(loanId);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to Fetch loan Details");
		}
	}

	@Override
	public Client getClient(int clientId) {
		Client dto = clientdao.getClient(clientId);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to fetch the client details");
		}
	}

	@Override
	public Payment makePayment(Payment payment) {
		Payment dto = clientdao.makePayment(payment);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to add Payment");
		}
	}

	@Override
	public Payment getPayment(long paymentId) {
		Payment dto = clientdao.getPayment(paymentId);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to fetch Payment details");
		}
	}

}
