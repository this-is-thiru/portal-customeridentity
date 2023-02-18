package com.infy.portal.customeridentity.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infy.portal.customeridentity.dto.CustomerIdentityDTO;
import com.infy.portal.customeridentity.entity.CustomerIdentity;
import com.infy.portal.customeridentity.repository.CustomerIdentityRepository;

@Service
public class CustomerIdentityService {
	
	@Autowired
	CustomerIdentityRepository customerIdentityRepository;
	
	public ResponseEntity<String> addCustomerIdentity(CustomerIdentityDTO customerIdentityDTO){
		CustomerIdentity customerIdentity=new CustomerIdentity();
		customerIdentity.setUniqueIdNumber(customerIdentityDTO.getUniqueIdNumber());
		customerIdentity.setDateOfBirth(customerIdentityDTO.getDateOfBirth());
		customerIdentity.setFirstName(customerIdentityDTO.getFirstName());
		customerIdentity.setLastName(customerIdentityDTO.getLastName());
		customerIdentity.setEmailAddress(customerIdentityDTO.getEmailAddress());
		customerIdentity.setState(customerIdentityDTO.getState());
		
		customerIdentityRepository.saveAndFlush(customerIdentity);
		return new ResponseEntity<String>(customerIdentity.toString(),HttpStatus.OK);
	}
	
	
	public ResponseEntity<String> findByDateOfBirthAndEmailAddress(LocalDate dateOfBirth, String emailAddress){
		Optional<CustomerIdentity> findByDateOfBirthAndEmailAddress = customerIdentityRepository.findByDateOfBirthAndEmailAddress(dateOfBirth, emailAddress);
		
		if(findByDateOfBirthAndEmailAddress.isPresent()) {
			return new ResponseEntity<String>("Request placed for you.",HttpStatus.OK);
			
		}
		else {
			return new ResponseEntity<String>("No request placed for you.",HttpStatus.BAD_REQUEST);
		}
	}
	

}
