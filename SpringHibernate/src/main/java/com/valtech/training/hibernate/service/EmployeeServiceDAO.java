package com.valtech.training.hibernate.service;

import com.valtech.training.hibernate.Employee;
import com.valtech.training.hibernate.dao.EmployeeDAO;

public interface EmployeeServiceDAO {

	EmployeeDAO getEmployeeDAO();

	Employee createEmployee(Employee e);

	Employee makeActive(Employee e);

	Employee makeInActive(Employee e);

	Employee incrementSalary(Employee e, int increment);

	void incrementSalaryForAll(int increment);

}