package com.sailu.CusomerDataManagement.dto;
import java.io.Serializable;
import lombok.Data;
@Data

public class CustomerDTO implements Serializable 
{
	private Integer id;
	private String name;
	private String email;
	public CustomerDTO(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
}
