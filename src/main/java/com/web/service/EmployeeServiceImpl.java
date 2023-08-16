package com.web.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.entity.Employee;
import com.web.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee saveEmployee(Employee employee) 
	{
		double pf=employee.getSalary()*0.15;    //calculating 15% PF
		
		double hra=employee.getSalary()*0.20;    //calculating 20% HRA
		
		double ta=employee.getSalary()*0.10;    //calculating 10% TA
		
		double netsalary=(employee.getSalary()+ta+hra)-pf;  
		
		employee.setPf(pf);
		employee.setHra(hra);
		employee.setTa(ta);
		employee.setNetsalary(netsalary);
		
		Employee e1= employeeRepo.save(employee);
		 
		return e1;
	}

	@Override
	public void deleteEmployee(Integer eid) 
	{
		employeeRepo.deleteById(eid);
		
	}

	@Override
	public Employee getEmployee(Integer eid) 
	{
	    Employee e1=employeeRepo.findById(eid).get();
		
		return e1;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> emp=new ArrayList<Employee>();
		emp=employeeRepo.findAll();
		
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer eid) {
     Optional<Employee> optional=employeeRepo.findById(eid);
		
		Employee e2=optional.get();
		
		e2.setEid(eid);
		e2.setEmpname(employee.getEmpname());
		e2.setEmpposition(employee.getEmpposition());
		e2.setEmail(employee.getEmail());
		e2.setEmplocation(employee.getEmplocation());
		e2.setSalary(employee.getSalary());
		
        double pf=employee.getSalary()*0.15;    //calculating 15% PF
		
		double hra=employee.getSalary()*0.20;    //calculating 20% HRA
		
		double ta=employee.getSalary()*0.10;    //calculating 10% TA
		
		double netsalary=(employee.getSalary()+ta+hra)-pf;  
		
		e2.setPf(pf);
		e2.setHra(hra);
		e2.setTa(ta);
		e2.setNetsalary(netsalary);
		
		
		 return employeeRepo.save(e2);
	}
	}


