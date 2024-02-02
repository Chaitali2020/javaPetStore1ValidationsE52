package com.example.PetStore1Validation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;



@Service
public class PetServiceLogic implements PetService{
	
	@Autowired
	private PetRepository petRepository;
	
	private Validator validator;

	@Autowired
	public PetServiceLogic(PetRepository petRepository, Validator validator) {
		this.petRepository=petRepository;
		this.validator=validator;
	}
	
	@Override
	public Pet savePet(Pet pet) {
		// TODO Auto-generated method stub
//		Errors errors = new BeanPropertyBindingResult(pet, "pet");
//		validator.validate(pet,errors);
//		
//		if(errors.hasErrors()) {
//			throw new PetValidationException("validation failed...",errors);
//		}
		return this.petRepository.save(pet);
	}

	@Override
	public List<Pet> getAllPets() {
		// TODO Auto-generated method stub
		return this.petRepository.findAll();
	}

	@Override
	public Pet getPetByID(Long id) {
		return this.petRepository.findById(id).orElse(null);
	}
	
	@Override
	public void deletePetById(Long id) {
		this.petRepository.deleteById(id);
	}
	
	@Override
	public Pet updatePet(Pet pet) {
		return this.petRepository.save(pet);
	}
	
}
