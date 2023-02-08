package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private Integer employeeId;
	
	@NotNull
	private String empName;
	@NotNull
	private Integer empSalary;
	

}
