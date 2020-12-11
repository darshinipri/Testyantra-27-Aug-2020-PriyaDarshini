package com.ty.lms.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name="loan_application_Status")
public class LoanStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int StatusId;
	
	private String status;
	
	@Column(name="application_category")
	private String category;
	
	@Column(name="approver_id")
	private String approverId;
	
	@DateTimeFormat
	@Column(name="approved_on")
	private Date approvedOn ;
	
	
}
