package com.ketan.advice;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ExceptionMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String message;
	private int statusCode;
	private Date timeStamp;

	public ExceptionMessage() {
		super();
	}

	public ExceptionMessage(String message, int statusCode, Date timeStamp) {
		super();
		this.message = message;
		this.statusCode = statusCode;
		this.setTime(timeStamp);
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

	public Date getTime() {
		return timeStamp;
	}

	public void setTime(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}
