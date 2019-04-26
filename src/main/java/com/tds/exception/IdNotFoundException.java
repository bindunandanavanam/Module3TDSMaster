package com.tds.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Execution of user defined exception
@ResponseStatus(HttpStatus.NOT_FOUND)
public class IdNotFoundException extends Exception {
	
	public IdNotFoundException(String msg) {
		super(msg);
	}

}