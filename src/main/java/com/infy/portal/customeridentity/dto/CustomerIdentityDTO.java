package com.infy.portal.customeridentity.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

public class CustomerIdentityDTO {
	Long uniqueIdNumber;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotNull(message="dob value is required")
	@Past(message="dob value is required")
	LocalDate dateOfBirth;
	String firstName;
	String lastName;
	@Pattern(regexp="^(?=.{1,64}@)[a-zA-Z0-9+_-]+(\\.[a-zA-Z0-9+_-]+)*@"+"[^-][a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[A-Za-z]{2,3})$",message="Email value is required")
	String emailAddress;
	String state;
	
	public CustomerIdentityDTO(Long uniqueIdNumber, LocalDate dateOfBirth, String firstName, String lastName,
			String emailAddress, String state) {
		super();
		this.uniqueIdNumber = uniqueIdNumber;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.state = state;
	}

	@Override
	public String toString() {
		return "CustomerIdentityDTO [uniqueIdNumber=" + uniqueIdNumber + ", dateOfBirth=" + dateOfBirth + ", firstName="
				+ firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress + ", state=" + state + "]";
	}

	public Long getUniqueIdNumber() {
		return uniqueIdNumber;
	}

	public void setUniqueIdNumber(Long uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	

}
