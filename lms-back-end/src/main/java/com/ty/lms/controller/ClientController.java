package com.ty.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.lms.dto.ResponseDTO;
import com.ty.lms.entities.Payment;
import com.ty.lms.service.ClientService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private ClientService service;

	@PostMapping

	public ResponseDTO MakePayment(@RequestBody Payment payment) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.makePayment(payment));
		return response;

	}

	@GetMapping
	public ResponseDTO getlnDEtails(long loanId) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getLoanDetails(loanId));
		return response;

	}

	@GetMapping("/Payment")
	public ResponseDTO getpayment(long paymentId) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getPayment(paymentId));
		return response;
	}

}
