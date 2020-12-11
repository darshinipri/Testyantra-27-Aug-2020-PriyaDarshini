package com.ty.lms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.ty.lms.entities.Client;
import com.ty.lms.entities.Loan;

import com.ty.lms.entities.Payment;

@Repository
public class ClientDAOImpl implements ClientDAO {
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public Loan getLoanDetails(long loanId) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Loan.class, loanId);
	}

	@Override
	public Client getClient(int clientId) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Client.class, clientId);
	}

	@Override
	public Payment makePayment(Payment payment) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(payment);
		manager.getTransaction().commit();
		return payment;
	}

	@Override
	public Payment getPayment(long paymentId) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Payment.class, paymentId);
	}

}
