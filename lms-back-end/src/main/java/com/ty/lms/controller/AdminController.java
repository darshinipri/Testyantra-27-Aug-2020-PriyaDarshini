package com.ty.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.lms.dto.ResponseDTO;
import com.ty.lms.entities.Employee;
import com.ty.lms.entities.Role;
import com.ty.lms.service.AdminService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService service;

	@PostMapping
	public ResponseDTO addEmploye(@RequestBody Employee emp) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.addEmployee(emp));
		return response;

	}

	@PutMapping
	public ResponseDTO UpdateEmp(@RequestBody Employee emp) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.updateEmployee(emp));
		return response;

	}

	@DeleteMapping("/{employeeId}")
	public ResponseDTO delEmployee(@PathVariable int employeeId) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.deleteEmployee(employeeId));
		return response;
	}

	@GetMapping
	public ResponseDTO getEmp(@RequestParam("email") String email) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getEmployee(email));
		return response;
	}

	@GetMapping("/employees")
	public ResponseDTO getAllEmp() {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getallEmployee());
		return response;
	}

	@PostMapping("/role")
	public ResponseDTO addRoles(@RequestBody Role role) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.addRole(role));
		return response;

	}

	@PutMapping("/role")
	public ResponseDTO updateRoles(@RequestBody Role role) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.updateRole(role));
		return response;
	}
}
