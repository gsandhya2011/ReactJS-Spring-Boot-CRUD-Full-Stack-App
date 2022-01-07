package com.sandhya.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//whenever resource(record) doesn't exist in the database then we throw this exception
//from the API layer Rest API throws this exception
@ResponseStatus(value = HttpStatus.NOT_FOUND) //Api returns NOT_FOUND status to the client
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
