package com.web.service;

import java.util.List;

import com.web.entity.Employee;


public interface EmployeeService 
{
	
	public void deleteEmployee(Integer eid);
	
	public Employee getEmployee(Integer eid);

	public Employee saveEmployee(Employee eid);
	
	public List<Employee> getAllEmployee();
	
	public Employee updateEmployee(Employee employee,Integer eid);

}
