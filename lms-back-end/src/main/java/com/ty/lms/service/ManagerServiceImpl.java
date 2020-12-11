package com.ty.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.lms.dao.ManagerDAO;
import com.ty.lms.entities.Client;
import com.ty.lms.entities.Loan;
import com.ty.lms.entities.LoanApplication;
import com.ty.lms.entities.LoanStatus;
import com.ty.lms.entities.LoanType;
import com.ty.lms.entities.Overdueloan;
import com.ty.lms.entities.Payment;
import com.ty.lms.exceptions.LoanException;

@Service
public class ManagerServiceImpl implements ManagerService {
	@Autowired
	private ManagerDAO managerdao;

	@Override
	public Client addClient(Client client) {
		Client dto = managerdao.addClient(client);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to add Client");
		}
	}

	@Override
	public Client updateClient(Client client) {
		Client dto = managerdao.updateClient(client);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to Update Client details");
		}
	}

	@Override
	public Client deleteClient(int ClientId) {
		Client dto = managerdao.deleteClient(ClientId);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to delete Client details");
		}
	}

	@Override
	public Client getClient(Client client) {
		Client dto = managerdao.getClient(client);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to fetch Client details");
		}
	}

	@Override
	public List<Client> getAllClient() {
		List<Client> dtoList = managerdao.getAllClient();
		if (dtoList != null) {
			return dtoList;
		} else {
			throw new LoanException("Unable to Fetch all the Client details");
		}
	}

	@Override
	public Loan addloan(Loan loan) {
		Loan dto = managerdao.addloan(loan);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to add Loan details");
		}
	}

	@Override
	public Loan updateloan(Loan loan) {
		Loan dto = managerdao.updateloan(loan);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to update Loan details");
		}
	}

	@Override
	public Loan deleteloan(long loanId) {
		Loan dto = managerdao.deleteloan(loanId);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to detele Loan details");
		}
	}

	@Override
	public Loan getloan(Loan loan) {
		Loan dto = managerdao.getloan(loan);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to get Loan details");
		}
	}

	@Override
	public List<Loan> getAlloan() {
		List<Loan> dtoList = managerdao.getAlloan();
		if (dtoList != null) {
			return dtoList;
		} else {
			throw new LoanException("Unable to Fetch all the Loan details");

		}
	}

	@Override
	public Overdueloan addodloan(Overdueloan loan) {
		Overdueloan dto = managerdao.addodloan(loan);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to add overdueloan details");
		}
	}

	@Override
	public Overdueloan updateodloan(Overdueloan loan) {
		Overdueloan dto = managerdao.updateodloan(loan);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to update overdueloan details");
		}
	}

	@Override
	public Overdueloan deleteodloan(long overDueLoanId) {
		Overdueloan dto = managerdao.deleteodloan(overDueLoanId);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to delete overdueloan details");
		}
	}

	@Override
	public Overdueloan getodloan(Overdueloan loan) {
		Overdueloan dto = managerdao.getodloan(loan);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to get overdueloan details");
		}
	}

	@Override
	public List<Overdueloan> getallodloan() {
		List<Overdueloan> dtoList = managerdao.getallodloan();
		if (dtoList != null) {
			return dtoList;
		} else {
			throw new LoanException("Unable to Fetch all the overdueloan details");

		}
	}

	@Override
	public Payment addPayment(Payment pay) {
		Payment dto = managerdao.addPayment(pay);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to add Payment details");
		}
	}

	@Override
	public Payment updatePayment(Payment pay) {
		Payment dto = managerdao.updatePayment(pay);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to  update Payment details");
		}
	}

	@Override
	public Payment deletePayment(int paymentId) {
		Payment dto = managerdao.deletePayment(paymentId);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to delete Payment details");
		}
	}

	@Override
	public Payment getPaymentdetails(Payment pay) {
		Payment dto = managerdao.getPaymentdetails(pay);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to get Payment details");
		}
	}

	@Override
	public List<Payment> getallPaymentdetails() {
		List<Payment> dtoList = managerdao.getallPaymentdetails();
		if (dtoList != null) {
			return dtoList;
		} else {
			throw new LoanException("Unable to Fetch all the overdueloan details");

		}
	}

	@Override
	public LoanApplication applyLoan(LoanApplication application) {
		LoanApplication dto = managerdao.applyLoan(application);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to apply Loan details");
		}

	}

	@Override
	public LoanStatus getLoanStatus(LoanStatus ls) {
		LoanStatus dto = managerdao.getLoanStatus(ls);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to getLoanStatus details");
		}
	}

	@Override
	public LoanStatus updateLoanStatus(LoanStatus ls) {
		LoanStatus dto = managerdao.updateLoanStatus(ls);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to update details");
		}
	}

	@Override
	public LoanType addLoanType(LoanType lt) {
		LoanType dto = managerdao.addLoanType(lt);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to add loan Type");
		}
		
	}

	
}
