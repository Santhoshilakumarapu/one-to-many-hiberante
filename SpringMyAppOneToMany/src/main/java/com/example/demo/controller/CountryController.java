package com.example.demo.controller;

import java.util.Objects;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Country;
import com.example.demo.exception.CountryServiceException;
import com.example.demo.service.CountryService;


import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/country-services")
public class CountryController {
	
	@Autowired
	private CountryService countryService; 
	
	@PostMapping("/apicustomer")
	public ResponseEntity<Country> saveCountry(@Valid @RequestBody Country country) throws CountryServiceException{
		System.out.println("***********************");
		return Optional.ofNullable(country)
				.map(countryService::saveCountry)
				.filter(Objects::nonNull)
				.map(r->new ResponseEntity<>(r,HttpStatus.CREATED))
				.orElseThrow(()-> new CountryServiceException("Country is not saved due to some error"));
		
	}

}
