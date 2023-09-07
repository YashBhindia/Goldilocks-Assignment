package com.goldilocks.pojo;


import jakarta.persistence.Id;
import lombok.Data;


@Data
public class EmployeePojo {

	@Id
	private int employeeId;
	private String employeeName; 
	private int employeeAge;
}
