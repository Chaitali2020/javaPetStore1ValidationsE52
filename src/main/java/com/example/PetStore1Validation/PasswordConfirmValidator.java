package com.example.PetStore1Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordConfirmValidator implements ConstraintValidator<ValidPassword, Pet>{

	@Override
	public boolean isValid(Pet pet, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		String password = pet.getPassword();
		String confirmPassword = pet.getConfirmpassword() ;
		
		return password != null && password.equals(confirmPassword);
	}
	
	
	
}
