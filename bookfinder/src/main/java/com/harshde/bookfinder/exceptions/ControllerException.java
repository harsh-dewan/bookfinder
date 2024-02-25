package com.harshde.bookfinder.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import java.util.Date;

@RestControllerAdvice
public class ControllerException {
	
	@ExceptionHandler(BookNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Error bookNotFound(BookNotFoundException ex, WebRequest request) {
		return new Error(HttpStatus.NOT_FOUND.value(), ex.getMessage(), 
				new Date(), request.getDescription(false));
	}
	
	@ExceptionHandler(AuthorNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Error authorNotFound(AuthorNotFoundException ex, WebRequest request) {
		return new Error(HttpStatus.NOT_FOUND.value(), ex.getMessage(), 
				new Date(), request.getDescription(false));
	}
	
	@ExceptionHandler(PublisherNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Error publisherNotFound(PublisherNotFoundException ex, WebRequest request) {
		return new Error(HttpStatus.NOT_FOUND.value(), ex.getMessage(), 
				new Date(), request.getDescription(false));
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public Error allOtherExceptions(Exception ex, WebRequest request) {
		return new Error(HttpStatus.NOT_FOUND.value(), ex.getMessage(), 
				new Date(), request.getDescription(false));
	}

}