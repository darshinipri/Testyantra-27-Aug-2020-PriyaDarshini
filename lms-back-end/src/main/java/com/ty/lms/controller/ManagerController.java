package com.ty.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.lms.dto.ResponseDTO;
import com.ty.lms.entities.Client;
import com.ty.lms.entities.Loan;
import com.ty.lms.entities.LoanStatus;
import com.ty.lms.entities.LoanType;
import com.ty.lms.entities.Overdueloan;
import com.ty.lms.entities.Payment;
import com.ty.lms.service.ManagerService;

@RestController
@RequestMapping("/manager")
@CrossOrigin(origins="*")
public class ManagerController {

	@Autowired
	ManagerService service;

	@PostMapping

	public ResponseDTO addclient(@RequestBody Client client) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.addClient(client));
		return response;

	}

	@PutMapping("/managers/client")
	public ResponseDTO updateclient(@RequestBody Client client) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.updateClient(client));
		return response;

	}

	@DeleteMapping("/{ClientId}")
	public ResponseDTO delClient(int ClientId) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.deleteClient(ClientId));
		return response;

	}

	@GetMapping("/manager/client")
	public ResponseDTO getClient(Client client) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getClient(client));
		return response;

	}

	@GetMapping("/clients")
	public ResponseDTO getAllclient() {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getAllClient());
		return response;

	}

	@PostMapping("/loan")

	public ResponseDTO addLoan(@RequestBody Loan loan) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.addloan(loan));
		return response;

	}

	public ResponseDTO updateLoan(@RequestBody Loan loan) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.updateloan(loan));
		return response;

	}

	@DeleteMapping("/{loanId}")
	public ResponseDTO delloan(long loanId) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.deleteloan(loanId));
		return response;

	}

	@GetMapping("/loan")
	public ResponseDTO getLoan(Loan loan) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getloan(loan));
		return response;

	}

	@GetMapping("/loans")
	public ResponseDTO getAllLoan() {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getAlloan());
		return response;
	}

	@PostMapping("/odloan")

	public ResponseDTO addodLoan(@RequestBody Overdueloan loan) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.addodloan(loan));
		return response;

	}

	@PutMapping("/odloan")
	public ResponseDTO updateodLoan(@RequestBody Overdueloan loan) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.updateodloan(loan));
		return response;

	}

	@DeleteMapping("/odloan/{loanId}")
	public ResponseDTO delodloan(long overDueLoanId) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.deleteodloan(overDueLoanId));
		return response;

	}

	@GetMapping("/odloan")
	public ResponseDTO getodLoan(Overdueloan loan) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getodloan(loan));
		return response;

	}

	@GetMapping("/odloans")
	public ResponseDTO getAlodlLoan() {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getallodloan());
		return response;

	}

	@PostMapping("/pay")

	public ResponseDTO addPay(@RequestBody Payment pay) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.addPayment(pay));
		return response;

	}

	@PutMapping("/pay")
	public ResponseDTO updatePay(@RequestBody Payment pay) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.updatePayment(pay));
		return response;

	}

	@DeleteMapping("/pay/{paymentId}")
	public ResponseDTO delPay(int paymentId) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.deletePayment(paymentId));
		return response;

	}

	@GetMapping("/pay")
	public ResponseDTO getPay(Payment pay) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getPaymentdetails(pay));
		return response;

	}

	@GetMapping("/pays")
	public ResponseDTO getAlPay() {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getallPaymentdetails());
		return response;
	}

	@GetMapping("/loanstatus")
	public ResponseDTO getlnStatus(LoanStatus ls) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getLoanStatus(ls));
		return response;

	}

	@PutMapping("/loanstatus")
	public ResponseDTO updatelnStatus(@RequestBody LoanStatus ls) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.updateLoanStatus(ls));
		return response;

	}

	@PostMapping("/loantype")
	public ResponseDTO addLoanType(@RequestBody LoanType lt) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.addLoanType(lt));
		return response;

	}

	
}
