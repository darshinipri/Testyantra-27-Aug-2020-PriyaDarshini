package com.ty.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.lms.dao.AdminDAO;
import com.ty.lms.entities.Employee;
import com.ty.lms.entities.Role;
import com.ty.lms.exceptions.LoanException;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDAO admindao;

	@Override
	public Employee addEmployee(Employee emp) {
		Employee dto = admindao.addEmployee(emp);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to Create Employee");
		}
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		Employee dto = admindao.updateEmployee(emp);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to Update Employee");
		}
	}

	@Override
	public Employee deleteEmployee(int employeeId) {
		Employee dto = admindao.deleteEmployee(employeeId);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to Delete Employee");
		}
	}

	@Override
	public Employee getEmployee(String email) {
		Employee dto = admindao.getEmployee(email);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to Fetch the Employee details");
		}
	}

	@Override
	public List<Employee> getallEmployee() {
		List<Employee> dtoList = admindao.getallEmployee();
		if (dtoList != null) {
			return dtoList;
		} else {
			throw new LoanException("Unable to Fetch all the Employee details");
		}
	}

	@Override
	public Role addRole(Role role) {
		Role dto = admindao.addRole(role);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to Add Role");
		}
	}

	@Override
	public Role updateRole(Role role) {
		Role dto = admindao.updateRole(role);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to Update Role");
		}
	}

}
