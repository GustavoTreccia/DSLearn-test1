package com.test.point.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -7826954575281502455L;
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
