package com.ty.lms.service;

import java.util.List;

import com.ty.lms.entities.Employee;
import com.ty.lms.entities.Role;

public interface AdminService {

	public Employee addEmployee(Employee emp);

	public Employee updateEmployee(Employee emp);

	public Employee deleteEmployee(int employeeId);

	public Employee getEmployee(String email);

	public List<Employee> getallEmployee();

	public Role addRole(Role role);

	public Role updateRole(Role role);
}
