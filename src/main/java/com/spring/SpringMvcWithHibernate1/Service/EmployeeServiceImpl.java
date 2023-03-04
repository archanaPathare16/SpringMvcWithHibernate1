package com.spring.SpringMvcWithHibernate1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringMvcWithHibernate1.Dao.EmployeeDaoI;
import com.spring.SpringMvcWithHibernate1.Model.Employee;

@Service
public class EmployeeServiceImpl  implements EmployeeServiceI{


	@Autowired
	private EmployeeDaoI employeeDaoI;

	@Override
	public int saveEmployee(Employee emp) {

		int id = employeeDaoI.saveEmployee(emp);
		return id;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployee = employeeDaoI.getAllEmployee();
		return allEmployee;
	}
}
