package com.valtech.training.hibernate.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.valtech.training.hibernate.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private SessionFactory sesFac;
	
	@Override
	public SessionFactory getSesFac() {
		return sesFac;
	}
	public void setSesFac(SessionFactory sesFac) {
		this.sesFac = sesFac;
	}
	
	@Override
	public Employee saveEmployee(Employee emp) {
		Session ses = sesFac.getCurrentSession();
		ses.persist(emp);
		return emp;
		
	}
	
	@Override
	public Employee updateEmployee(Employee emp) {
		Session ses = sesFac.getCurrentSession();
		emp = (Employee)ses.merge(emp);
		return emp;
		
	}

	@Override
	public Employee loadEmployee(int empId) {
		Session ses = sesFac.getCurrentSession();
		Employee emp = (Employee) ses.load(Employee.class, empId);
		return emp;
		
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		Session ses = sesFac.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Employee> emps = ses.createQuery("from Employee e").list();
		return emps;
		
	}
	
	@Override
	public Employee deleteEmployee(Employee emp) {
		Session ses = sesFac.getCurrentSession();
		ses.delete(emp);
		return emp;
		
	}
	
}
