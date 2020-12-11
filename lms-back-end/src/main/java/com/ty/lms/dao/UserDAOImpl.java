package com.ty.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import com.ty.lms.dto.UserDTO;
import com.ty.lms.entities.LoanApplication;
import com.ty.lms.entities.LoanStatus;
import com.ty.lms.entities.User;

@Repository
public class UserDAOImpl implements UserDAO {
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public LoanApplication applyLoan(LoanApplication Application) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(Application);
		manager.getTransaction().commit();
		return Application;
	}

	@Override
	public User registerUser(User user) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		return user;
	}

	@Override
	public User getUser(String userEmail) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<User> query = manager.createQuery("FROM User U where U.userEmail=:email", User.class);
		query.setParameter("email", userEmail);
		List<User> userList = query.getResultList();
		if (userList.isEmpty()) {
			return null;
		} else {
			return userList.get(0);
		}

	}

	@Override
	public LoanStatus getLoanStatus(int applicationId) {
		EntityManager manager = factory.createEntityManager();
		LoanStatus status = manager.find(LoanStatus.class, applicationId);
		manager.close();
		return status;

	}

	@Override
	public User authenticate(UserDTO user) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		TypedQuery<User> query = manager.createQuery("FROM User U where U.userEmail=:email AND U.password=:password",
				User.class);
		query.setParameter("email", user.getUserEmail());
		query.setParameter("password", user.getPassword());
		User user1 = (User) query.getSingleResult();
			manager.close();
			return user1;
		
	}

}
