package com.cg.employeemanagement.dao;
import com.cg.employeemanagement.dto.Employee;

public interface EmployeeDao { 
	public boolean addEmployee(Employee emp);
	public Employee updateEmployee(int id);
	public boolean removeEmployee(int id);
	public Employee searchEmployee(int id);
	public Employee[] showEmployee(Employee emp);
	

}
