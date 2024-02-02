package com.example.PetStore1Validation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@ValidPassword
@Entity
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Name Value is required")
	@Size(max=100, message = "Name must be lesser than or equal to 100 Characters")
	private String name;
	
	//@NotBlank(message="Breed Value is required")
	//@Size(max=100, message = "Breed must be lesser than or equal to 100 Characters")
	@ValidBreed
	private String breed;
	
	//@Size(max=100, message = "Price value must be given")
	private int price;
	
	//custome Validation
	@ValidPhoneNumber(message = "Invalid Phone Number")
	private String phoneNumber;
	
	@NotBlank(message="Password is mandatory")
	private String password;
	
	@NotBlank(message = "Confirm is mandatory")
	private String confirmpassword;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	
}
