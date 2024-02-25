package com.harshde.bookfinder.exceptions;

import java.util.Date;

public class Error {
	
	private int errorCode;
	private String errorMessage;
	private Date errorDate;
	private String errorDescription;
	
	public Error() {}
	
	public Error(int errorCode, String errorMessage, Date errorDate, String errorDescription) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.errorDate = errorDate;
		this.errorDescription = errorDescription;
	}


	public int getErrorCode() {
		return errorCode;
	}




	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}




	public String getErrorMessage() {
		return errorMessage;
	}




	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}




	public Date getErrorDate() {
		return errorDate;
	}




	public void setErrorDate(Date errorDate) {
		this.errorDate = errorDate;
	}




	public String getErrorDescription() {
		return errorDescription;
	}




	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}




	@Override
	public String toString() {
		return "Error [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", errorDescription="
				+ errorDescription + "]";
	}
	
	

}
