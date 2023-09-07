package com.goldilocks.service;



import java.util.List;

import com.goldilocks.pojo.EmployeePojo;

public interface EmployeeService {

	public String createEmployee(EmployeePojo employeepojo);
	
	public List<EmployeePojo> getAllEmployee();
	
	public String deleteEmployee(int employeeId);
	
	public EmployeePojo getEmployeeById(int id);
}
