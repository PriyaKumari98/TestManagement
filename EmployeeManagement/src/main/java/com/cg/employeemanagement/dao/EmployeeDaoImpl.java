package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;

import com.cg.employeemanagement.dao.EmployeeDao;
import com.cg.employeemanagement.service.*;

public class EmployeeDaoImpl implements EmployeeDao{
	
	Employee emp[]=new Employee[5];
	static int counter;
	Employee e=new Employee();
	

	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		if(counter>=5)
		{
			return false;
		}
		this.emp[counter++]=emp;
		
		return true;
	}

	public Employee updateEmployee(int id) {
		// TODO Auto-generated method stub
		for(int i=0;i<emp.length ; i++) 
		{
			if(emp.getEmpId() == id)
				int sal=emp[i].getSalary();
			sal=sal+(0.15*sal);
			 emp.setSalary(sal);
		}
		
		
		
	}

	public boolean removeEmployee(int id) {
		// TODO Auto-generated method stub
		
		for(int j=0; j<emp.length; j++) {
			if(emp.getEmpId()== id) {
				emp[i]=null;
				return true;
			}
		}
		return false;
		
	}

	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee[] showEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}
	  
	

}
