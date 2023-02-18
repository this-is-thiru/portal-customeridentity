package com.infy.portal.customeridentity.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.portal.customeridentity.entity.CustomerIdentity;

public interface CustomerIdentityRepository extends JpaRepository<CustomerIdentity,Long>{
	Optional<CustomerIdentity> findByDateOfBirthAndEmailAddress(LocalDate dateOfBirth,String emailAddress);

}
