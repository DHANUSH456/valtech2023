package com.valtech.training.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.valtech.training.hibernate.Employee;

public interface EmployeeDAO {

	SessionFactory getSesFac();

	Employee saveEmployee(Employee emp);

	Employee updateEmployee(Employee emp);

	Employee loadEmployee(int empId);

	List<Employee> getAllEmployee();

	Employee deleteEmployee(Employee emp);

}