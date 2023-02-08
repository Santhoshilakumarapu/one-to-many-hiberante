package com.example.demo.exception;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.dto.ErrorResponseDTO;

@ControllerAdvice
public class CountryServuceExceptionHandler {
	
	@ExceptionHandler(value =CountryServiceException.class )
	private ResponseEntity<Object> handleCountryServiceException(CountryServiceException e){
		ErrorResponseDTO errorResponseDTO= new ErrorResponseDTO(Arrays.asList(e.getMessage()),
				HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<>(errorResponseDTO,HttpStatus.BAD_REQUEST);
		
	}

}
