package com.app.update.scheduler.jamfpro.api;

public class JssApiException extends Exception {

	private static final long serialVersionUID = 8115086578198181199L;
	private Exception e;
	private int httpResponseCode;
	
	public JssApiException(Exception e, int lastResponseCode) {
		this.e = e;
		this.httpResponseCode = lastResponseCode;
	}

	public Exception getE() {
		return e;
	}

	public int getHttpResponseCode() {
		return httpResponseCode;
	}

}
