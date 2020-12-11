package com.ty.lms.dao;

import com.ty.lms.dto.UserDTO;
import com.ty.lms.entities.LoanApplication;
import com.ty.lms.entities.LoanStatus;
import com.ty.lms.entities.User;

public interface UserDAO {
	
	public LoanApplication applyLoan(LoanApplication Application);
	
	public User registerUser(User user);
	
	public User getUser(String userEmail);
	
	public LoanStatus getLoanStatus(int applicationId);
	
	
	public User authenticate(UserDTO user);
	

}
