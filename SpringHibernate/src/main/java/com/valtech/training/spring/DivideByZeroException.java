package com.valtech.training.spring;

public class DivideByZeroException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public DivideByZeroException(String message) {
		
		super(message);
		
	}

}
