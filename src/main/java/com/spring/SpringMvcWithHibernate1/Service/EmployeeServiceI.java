package com.spring.SpringMvcWithHibernate1.Service;

import java.util.List;

import com.spring.SpringMvcWithHibernate1.Model.Employee;

public interface EmployeeServiceI {
	
	public int saveEmployee(Employee emp);

	public List<Employee> getAllEmployees();
}
