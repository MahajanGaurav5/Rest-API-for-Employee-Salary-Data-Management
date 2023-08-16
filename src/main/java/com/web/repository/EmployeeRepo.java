package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> 
{

}
