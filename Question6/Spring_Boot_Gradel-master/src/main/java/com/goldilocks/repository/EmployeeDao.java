package com.goldilocks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goldilocks.model.Employee;
import com.goldilocks.pojo.EmployeePojo;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

//	Employee save(Employee employee);

	

	

}
