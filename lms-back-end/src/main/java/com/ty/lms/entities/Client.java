package com.ty.lms.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import lombok.Data;

@Data
@Entity
@Table(name = "clients")

public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientId;

	//@Pattern(regexp = "/^[a-z ,.'-]+$/i\n")
	@Column(name = "first_name")
	private String firstName;

	//@Pattern(regexp = "/^[a-z ,.'-]+$/i\n")
	@Column(name = "last_name")
	private String lastName;

	//@Pattern(regexp = "^[#.0-9a-zA-Z\\s,-]+$\n")
	@Column(name = "address_1")
	private String address1;

	@Column(name = "address_2")
	private String address2;

	//@Pattern(regexp = "/^(\\+\\d{1,3}[- ]?)?\\d{10}$/")
	private int mobileNo1;

	//@Pattern(regexp = "/^[a-zA-Z ]*$/")
	private String state;

	//@Pattern(regexp = "/^[a-zA-Z ]*$/")
	private String city;

	//@Pattern(regexp = "^[0-9]{6,6}$")
	private int pincode;

	@Column(name = "client_Status")
	private String clientStatus;

	@Valid
	private String email;

	@OneToMany(mappedBy = "client")
	private List<Loan> loan;

}
