package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Employee;
import com.web.service.EmployeeService;   

@RestController
public class EmployeeController
{
	@Autowired
	private EmployeeService empService;
	 
	@PostMapping("/save")
	 public String saveStudent(@RequestBody Employee eid )
	 {
		Employee e2= empService.saveEmployee(eid);
		
		String msg=null;
		
		if(e2!=null)
		{
			msg="Data Saved Successfully...";
		}
		else
		{
			msg="Data Not Saved ";
		}
		
		
		return msg;
		
	 }
	
	
	@DeleteMapping("/delete/{eid}")
	public void deleteEmployeeData(@PathVariable Integer eid)
	{
		empService.deleteEmployee(eid);
		System.out.println("One Employee Data Deleted Successfully..");
		
	}
	
	@GetMapping("/get/{eid}")
	public Employee getEmployeeData(@PathVariable Integer eid)
	{
		Employee e3=empService.getEmployee(eid);
		
		return e3;
		
	}
	
	@GetMapping("/getall")
	public List<Employee> getEmployeeData()
	{
		List<Employee> emp= empService.getAllEmployee();
		
		return emp;
	}
	
   @PutMapping("/update/{eid}")
   public Employee updateStudent(@RequestBody Employee employee,@PathVariable Integer eid)
   {
	    
	   return empService.updateEmployee(employee, eid);
   }

}
