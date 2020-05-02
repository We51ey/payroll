package com.github.rshtishi.payroll.employee.service;

import java.util.List;

import com.github.rshtishi.payroll.employee.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public long countByDepartmentId(int departmentId);
	
	public void createEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public void deleteEmployee(int employeeId);

}
