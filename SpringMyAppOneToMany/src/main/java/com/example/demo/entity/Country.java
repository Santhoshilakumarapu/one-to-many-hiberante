package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Country {
	
	
	@Id
	@GeneratedValue
	private Integer countryId;
	
	@NotNull(message = "countryName should not be bull")
	@NotEmpty(message = "countryName should not be Empty")
	@Size(min=3,max=20)
	private String countryName;
	
	
	@NotNull(message = "countryCode should not be bull")
	@NotEmpty(message = "countryCode should not be Empty")
	@Size(min=3,max=3)
	private String countryCode;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="country_fk",referencedColumnName = "countryId")
	private List<Company> companies;

}
