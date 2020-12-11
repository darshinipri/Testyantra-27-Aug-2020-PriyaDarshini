package com.ty.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.ty.lms.entities.Employee;
import com.ty.lms.entities.Role;

@Repository
public class AdminDAOImpl implements AdminDAO {
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public Employee addEmployee(Employee emp) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(emp);
		manager.getTransaction().commit();
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		EntityManager manager = factory.createEntityManager();
		Employee emp1 = manager.find(Employee.class, emp.getEmployeeId());
		manager.getTransaction().begin();
		BeanUtils.copyProperties(emp, emp1);
		manager.getTransaction().commit();
		manager.close();
		return emp1;

	}

	@Override
	public Employee deleteEmployee(int employeeId) {
		EntityManager manager = factory.createEntityManager();
		Employee emp1 = manager.find(Employee.class, employeeId);
		manager.getTransaction().begin();
		manager.remove(emp1);
		manager.getTransaction().commit();
		return emp1;

	}

	@Override
	public Employee getEmployee(String email) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("FROM Employee E WHERE E.email = :value");
		query.setParameter("value", email);
		List<Employee> empList = query.getResultList();
		if (empList.isEmpty()) {
			return null;
		} else {
			return empList.get(0);
		}

	}

	@Override
	public List<Employee> getallEmployee() {
		EntityManager manager = factory.createEntityManager();
		List<Employee> empList = manager.createQuery("FROM Employee", Employee.class).getResultList();
		manager.close();
		return empList;
	}

	@Override
	public Role addRole(Role role) {

		EntityManager manager = factory.createEntityManager();

		if (role != null) {
			manager.getTransaction().begin();
			manager.persist(role);
			manager.getTransaction().commit();
			return role;
		} else {
			return null;

		}
	}

	@Override
	public Role updateRole(Role role) {
		EntityManager manager = factory.createEntityManager();
		Role role1 = manager.find(Role.class, role.getRoleId());
		if (role1 != null) {
			manager.getTransaction().begin();
			BeanUtils.copyProperties(role, role1);
			return role1;
		} else {
			return null;
		}

	}

}
