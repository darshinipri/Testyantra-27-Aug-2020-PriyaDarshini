package com.ty.lms.dto;

import java.util.List;

import com.ty.lms.entities.Loan;

import lombok.Data;

@Data
public class Client {

	private int clientId;

	private String firstName;

	private String lastName;

	private String address1;

	private String address2;

	private int mobileNo1;

	private String state;

	private String city;

	private int pincode;

	private String clientStatus;

	private String email;

	private List<Loan> loan;

}
