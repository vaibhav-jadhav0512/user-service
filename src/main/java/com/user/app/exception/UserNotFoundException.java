package com.user.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User not found")
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String string) {
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2450664766422436031L;

}
