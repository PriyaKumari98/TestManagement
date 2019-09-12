package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dto.Employee;

public interface EmployeeService {

	public boolean addEmployee(Employee emp);
	public Employee updateEmployee(int id);
	public boolean removeEmployee(int id);
	public Employee searchEmployee(int id);
	public Employee[] showEmployee(Employee emp);
}
