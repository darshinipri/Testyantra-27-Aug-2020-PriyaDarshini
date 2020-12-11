package com.ty.lms.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ty.lms.dto.ResponseDTO;

@RestControllerAdvice
@CrossOrigin(origins="*")
public class ControllerAdvicer {
	
	@ExceptionHandler
	public ResponseDTO exceptionHandler(Exception e) {
		ResponseDTO response = new ResponseDTO();
		response.setError(true);
		response.setData(e.getMessage());
		return response;
		
	}
	

}
