package com.ty.lms.dao;

import java.util.List;

import com.ty.lms.entities.Client;
import com.ty.lms.entities.Loan;
import com.ty.lms.entities.LoanApplication;
import com.ty.lms.entities.LoanStatus;
import com.ty.lms.entities.LoanType;
import com.ty.lms.entities.Overdueloan;
import com.ty.lms.entities.Payment;

public interface ManagerDAO {

	public Client addClient(Client client);

	public Client updateClient(Client client);

	public Client deleteClient(int ClientId);

	public Client getClient(Client client);

	public List<Client> getAllClient();

	public Loan addloan(Loan loan);

	public Loan updateloan(Loan loan);

	public Loan deleteloan(long loanId);

	public Loan getloan(Loan loan);

	public List<Loan> getAlloan();

	public Overdueloan addodloan(Overdueloan loan);

	public Overdueloan updateodloan(Overdueloan loan);

	public Overdueloan deleteodloan(long overDueLoanId);

	public Overdueloan getodloan(Overdueloan loan);

	public List<Overdueloan> getallodloan();

	public Payment addPayment(Payment pay);

	public Payment updatePayment(Payment pay);

	public Payment deletePayment(int paymentId);

	public Payment getPaymentdetails(Payment pay);

	public List<Payment> getallPaymentdetails();

	public LoanApplication applyLoan(LoanApplication application);

	public LoanStatus getLoanStatus(LoanStatus ls);

	public LoanStatus updateLoanStatus(LoanStatus ls);
	
	public LoanType addLoanType(LoanType lt);
	
	
	
	

}
