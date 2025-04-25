package com.ketan.advice;

public class ApiException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String message;
	private int statusCode;

	public ApiException() {
		super();
	}

	public ApiException(String message, int statusCode) {
		super();
		this.message = message;
		this.statusCode = statusCode;

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}
