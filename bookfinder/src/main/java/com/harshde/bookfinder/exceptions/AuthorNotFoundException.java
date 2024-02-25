package com.harshde.bookfinder.exceptions;

public class AuthorNotFoundException extends RuntimeException {


	private static final long serialVersionUID = 1L;
	
	String message = "";
	public AuthorNotFoundException(String msg) {
		super(msg);
		message = msg;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
