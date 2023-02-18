package com.infy.portal.customeridentity.controller;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.portal.customeridentity.dto.CustomerIdentityDTO;
import com.infy.portal.customeridentity.service.CustomerIdentityService;

@RestController
@EnableAutoConfiguration
@CrossOrigin
@RequestMapping("customeridentity")
public class CustomerIdentityController {
	
	@Autowired
	CustomerIdentityService customerIdentityService;
	
	@PostMapping("insert")
	public ResponseEntity<String> addCustomerIdentity(@Valid @RequestBody CustomerIdentityDTO customerIdentityDTO){
		return customerIdentityService.addCustomerIdentity(customerIdentityDTO);
	}
	
	
//	RestPointApi-2
	@PostMapping("emaildobvalidation")
	public ResponseEntity<String> findByDateOfBirthAndEmailAddress(@Valid @RequestBody CustomerIdentityDTO customerIdentityDTO){
		LocalDate dob=customerIdentityDTO.getDateOfBirth();
		String email=customerIdentityDTO.getEmailAddress();
		return customerIdentityService.findByDateOfBirthAndEmailAddress(dob, email);
//		return new ResponseEntity<String>(customerIdentityDTO.toString(),HttpStatus.OK);
	}

	

}
