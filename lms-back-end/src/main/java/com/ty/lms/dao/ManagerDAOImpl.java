package com.ty.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.ty.lms.entities.Client;
import com.ty.lms.entities.Loan;
import com.ty.lms.entities.LoanApplication;
import com.ty.lms.entities.LoanStatus;
import com.ty.lms.entities.LoanType;
import com.ty.lms.entities.Overdueloan;
import com.ty.lms.entities.Payment;

@Repository
public class ManagerDAOImpl implements ManagerDAO {
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public Loan addloan(Loan loan) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(loan);
		manager.getTransaction().commit();
		return loan;
	}

	@Override
	public Loan updateloan(Loan loan) {
		EntityManager manager = factory.createEntityManager();
		Loan ln = manager.find(Loan.class, loan.getLoanId());
		if (ln != null) {
			manager.getTransaction().begin();
			BeanUtils.copyProperties(loan, ln);
			manager.getTransaction().commit();
			manager.close();
			return ln;
		} else {
			return null;

		}
	}

	@Override
	public Loan deleteloan(long loanId) {
		EntityManager manager = factory.createEntityManager();
		Loan ln = manager.find(Loan.class, loanId);
		if (ln != null) {
			manager.getTransaction().begin();
			manager.remove(ln);
			manager.getTransaction().commit();
			return ln;
		} else {

			return null;
		}
	}

	@Override
	public Loan getloan(Loan loan) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Loan.class, loan.getLoanId());
	}

	@Override
	public List<Loan> getAlloan() {
		EntityManager manager = factory.createEntityManager();
		List<Loan> LoanList = manager.createQuery("FROM Loan", Loan.class).getResultList();
		manager.close();
		return LoanList;
	}

	@Override
	public Overdueloan addodloan(Overdueloan loan) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(loan);
		manager.getTransaction().commit();
		return loan;
	}

	@Override
	public Overdueloan updateodloan(Overdueloan loan) {
		EntityManager manager = factory.createEntityManager();
		Overdueloan odloan = manager.find(Overdueloan.class, loan.getOverDueLoanId());
		if (odloan != null) {
			manager.getTransaction().begin();
			BeanUtils.copyProperties(loan, odloan);
			manager.getTransaction().commit();
			manager.close();
			return odloan;
		} else {
			return null;

		}
	}

	@Override
	public Overdueloan deleteodloan(long overDueLoanId) {
		EntityManager manager = factory.createEntityManager();
		Overdueloan odln = manager.find(Overdueloan.class, overDueLoanId);
		if (odln != null) {
			manager.getTransaction().begin();
			manager.remove(odln);
			manager.getTransaction().commit();
			return odln;
		} else {

			return null;
		}
	}

	@Override
	public Overdueloan getodloan(Overdueloan loan) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Overdueloan.class, loan.getOverDueLoanId());
	}

	@Override
	public List<Overdueloan> getallodloan() {
		EntityManager manager = factory.createEntityManager();
		List<Overdueloan> LoanList = manager.createQuery("FROM Overdueloan", Overdueloan.class).getResultList();
		manager.close();
		return LoanList;
	}

	@Override
	public Payment addPayment(Payment pay) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(pay);
		manager.getTransaction().commit();
		return pay;
	}

	@Override
	public Payment updatePayment(Payment pay) {
		EntityManager manager = factory.createEntityManager();
		Payment pay1 = manager.find(Payment.class, pay.getPaymentId());
		if (pay1 != null) {
			manager.getTransaction().begin();
			BeanUtils.copyProperties(pay, pay1);
			manager.getTransaction().commit();
			manager.close();
			return pay1;
		} else {
			return null;

		}
	}

	@Override
	public Payment deletePayment(int paymentId) {
		EntityManager manager = factory.createEntityManager();
		Payment pay1 = manager.find(Payment.class, paymentId);
		if (pay1 != null) {
			manager.getTransaction().begin();
			manager.remove(pay1);
			manager.getTransaction().commit();
			return pay1;
		} else {

			return null;
		}
	}

	@Override
	public Payment getPaymentdetails(Payment pay) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Payment.class, pay.getPaymentId());
	}

	@Override
	public List<Payment> getallPaymentdetails() {
		EntityManager manager = factory.createEntityManager();
		List<Payment> payList = manager.createQuery("FROM Payment", Payment.class).getResultList();
		manager.close();
		return payList;
	}

	@Override
	public LoanApplication applyLoan(LoanApplication application) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(application);
		manager.getTransaction().commit();
		return application;

	}

	@Override
	public LoanStatus getLoanStatus(LoanStatus ls) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(LoanStatus.class, ls.getStatusId());
	}

	@Override
	public LoanStatus updateLoanStatus(LoanStatus ls) {
		EntityManager manager = factory.createEntityManager();
		LoanStatus lst = manager.find(LoanStatus.class, ls.getStatusId());
		if (lst != null) {
			manager.getTransaction().begin();
			BeanUtils.copyProperties(ls, lst);
			manager.getTransaction().commit();
			manager.close();
			return lst;
		} else {
			return null;

		}
	}

	@Override
	public Client addClient(Client client) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(client);
		manager.getTransaction().commit();
		return client;
	}

	@Override
	public Client updateClient(Client client) {
		EntityManager manager = factory.createEntityManager();
		Client c = manager.find(Client.class, client.getClientId());
		if (c != null) {
			manager.getTransaction().begin();
			BeanUtils.copyProperties(client, c);
			manager.getTransaction().commit();
			manager.close();
			return c;
		} else {
			return null;

		}
	}

	@Override
	public Client deleteClient(int ClientId) {
		EntityManager manager = factory.createEntityManager();
		Client c = manager.find(Client.class, ClientId);
		if (c != null) {
			manager.getTransaction().begin();
			manager.remove(c);
			manager.getTransaction().commit();
			return c;
		} else {
			return null;
		}
	}

	@Override
	public Client getClient(Client client) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Client.class, client.getClientId());
	}

	@Override
	public List<Client> getAllClient() {
		EntityManager manager = factory.createEntityManager();
		List<Client> clientList = manager.createQuery("FROM Client", Client.class).getResultList();
		manager.close();
		return clientList;
	}

	@Override
	public LoanType addLoanType(LoanType lt) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(lt);
		manager.getTransaction().commit();
		return lt;
	}


}
