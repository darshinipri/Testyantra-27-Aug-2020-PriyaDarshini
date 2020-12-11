package com.ty.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.lms.dto.ResponseDTO;
import com.ty.lms.dto.UserDTO;
import com.ty.lms.entities.LoanApplication;
import com.ty.lms.entities.User;
import com.ty.lms.service.UserService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/user")
public class UserController {
	@Autowired

	private UserService service;

	@PostMapping
	public ResponseDTO login(@RequestBody UserDTO user) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.authenticate(user));
		return response;
	}

	@PostMapping("/register")

	public ResponseDTO register(@RequestBody User user) {
		System.out.println(user);
		ResponseDTO response = new ResponseDTO();
		response.setData(service.registerUser(user));
		return response;

	}

	@GetMapping

	public ResponseDTO getUser(String userEmail) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getUser(userEmail));
		return response;

	}

	@GetMapping("/Status/{applicationId}")

	public ResponseDTO getLoanStatus(@RequestParam int applicationId) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getLoanStatus(applicationId));
		return response;

	}

	@PostMapping("/applyloan")

	public ResponseDTO applyloan(@RequestBody LoanApplication application) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.applyLoan(application));
		return response;

	}

}
