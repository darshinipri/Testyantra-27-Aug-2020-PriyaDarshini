package com.ty.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.lms.dao.UserDAO;
import com.ty.lms.dto.UserDTO;
import com.ty.lms.entities.LoanApplication;
import com.ty.lms.entities.LoanStatus;
import com.ty.lms.entities.User;
import com.ty.lms.exceptions.LoanException;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userdao;

	@Override
	public LoanApplication applyLoan(LoanApplication Application) {
		LoanApplication dto = userdao.applyLoan(Application);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to apply the loan");
		}
	}

	@Override
	public User registerUser(User user) {
		User dto = userdao.registerUser(user);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to register");
		}
	}

	@Override
	public User getUser(String userEmail) {
		User dto = userdao.getUser(userEmail);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to fetch the user details");
		}
	}

	@Override
	public LoanStatus getLoanStatus(int applicationId) {
		LoanStatus dto = userdao.getLoanStatus(applicationId);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("Unable to fetch the loanStatus");
		}
	}


	@Override
	public Object authenticate(UserDTO user) {
		User dto = userdao.authenticate(user);
		if (dto != null) {
			return dto;
		} else {
			throw new LoanException("invalid email or password");
		}
	}

}
