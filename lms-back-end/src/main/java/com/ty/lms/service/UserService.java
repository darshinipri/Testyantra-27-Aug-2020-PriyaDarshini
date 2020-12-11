package com.ty.lms.service;

import com.ty.lms.dto.UserDTO;
import com.ty.lms.entities.LoanApplication;
import com.ty.lms.entities.LoanStatus;
import com.ty.lms.entities.User;

public interface UserService {
	public LoanApplication applyLoan(LoanApplication Application);

	public User registerUser(User user);

	public User getUser(String userEmail);

	public LoanStatus getLoanStatus(int applicationId);

	public Object authenticate(UserDTO user);

}
