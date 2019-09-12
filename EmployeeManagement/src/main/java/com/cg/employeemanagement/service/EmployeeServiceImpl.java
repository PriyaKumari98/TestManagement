package com.cg.employeemanagement.service;
import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dao.EmployeeDao;
import com.cg.employeemanagement.service.EmployeeService;
import com.cg.employeemanagement.dao.EmployeeDaoImpl;
public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao dao=new EmployeeDaoImpl();

	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	public Employee updateEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(id);
	}

	public Employee removeEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.removeEmployee(id);
	}

	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.searchEmployee(id);
	}

	public Employee[] showEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.showEmployee(emp);
	}
	

}
