package com.spring.SpringMvcWithHibernate1.Dao;

import java.util.List;

import com.spring.SpringMvcWithHibernate1.Model.Employee;

public interface EmployeeDaoI {

public int saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployee();

}
