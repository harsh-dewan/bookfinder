package com.harshde.bookfinder.exceptions;

public class BookNotFoundException extends RuntimeException {
	

	private static final long serialVersionUID = 1L;
	String message = "";
	public BookNotFoundException(String msg) {
		super(msg);
		message = msg;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
