package com.example.PetStore1Validation;

import org.springframework.validation.Errors;

public class PetValidationException extends RuntimeException {

	private final Errors errors;
	
	public PetValidationException(String message, Errors errors) {
		super(message);
		this.errors = errors;
	}
	public Errors getErrors() {
		return this.errors;
	}
}
