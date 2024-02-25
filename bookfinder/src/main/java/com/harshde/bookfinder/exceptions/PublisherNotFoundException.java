package com.harshde.bookfinder.exceptions;

public class PublisherNotFoundException extends RuntimeException {


	private static final long serialVersionUID = 1L;
	
	String message = "";
	public PublisherNotFoundException(String msg) {
		super(msg);
		message = msg;
	}
	
	@Override
	public String getMessage() {
		return message;
	}


}
