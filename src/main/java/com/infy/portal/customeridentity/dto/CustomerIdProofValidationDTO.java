package com.infy.portal.customeridentity.dto;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CustomerIdProofValidationDTO {
	@Digits(fraction = 0, integer = 16, message="Id should be 16 digit")
	@DecimalMin(value="1000000000000000", message="Id should be 16 digit")
	@NotNull(message="Id should be 16 digit")
	Long uniqueIdNumber;
	@NotBlank(message="FirstName should not be null")
	String firstName;
	@NotBlank(message="LaststName should not be null")
	String lastName;
	@NotNull(message="DateOfBirth should not be null")
	LocalDate dateOfBirth;
	
	public CustomerIdProofValidationDTO(Long uniqueIdNumber, String firstName, String lastName, LocalDate dateOfBirth) {
		super();
		this.uniqueIdNumber = uniqueIdNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "CustomerIdProofValidationDTO [uniqueIdNumber=" + uniqueIdNumber + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + "]";
	}

	public Long getUniqueIdNumber() {
		return uniqueIdNumber;
	}

	public void setUniqueIdNumber(Long uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	

}
