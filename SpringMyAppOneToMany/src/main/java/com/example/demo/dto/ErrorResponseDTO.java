package com.example.demo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponseDTO {
	
	
	public ErrorResponseDTO(List<String> asList, Object object) {
		// TODO Auto-generated constructor stub
	}
	private List<String> errors;
	private Integer StatusCode;

}
