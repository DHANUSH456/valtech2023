package com.valtech.training.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.training.hibernate.Employee;
import com.valtech.training.hibernate.dao.EmployeeDAO;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeServiceImpl implements EmployeeServiceDAO {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	@Override
	public Employee createEmployee(Employee e) {
		return employeeDAO.saveEmployee(e);
	}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Employee makeActive(Employee e) {
		return employeeDAO.updateEmployee(e);
		
	}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Employee makeInActive(Employee e) {
		return employeeDAO.updateEmployee(e);
		
	}
	
	@Override
	public Employee incrementSalary(Employee e,int increment) {
		e.setSalary(e.getSalary()+increment);
		return employeeDAO.updateEmployee(e);
		
	}
	
	@Override
	public void incrementSalaryForAll(int increment) {
		employeeDAO.getAllEmployee().forEach(e -> e.setSalary(e.getSalary()+increment));
		
	}
}
