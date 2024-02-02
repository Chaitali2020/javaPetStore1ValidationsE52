package com.example.PetStore1Validation;

import java.util.List;

public interface PetService {
	
	Pet savePet(Pet pet);
	List<Pet> getAllPets();
	Pet getPetByID(Long id);
	void deletePetById(Long id);	
	Pet updatePet(Pet pet);
}
