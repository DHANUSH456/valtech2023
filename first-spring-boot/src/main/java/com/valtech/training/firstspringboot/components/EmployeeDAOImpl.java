package com.valtech.training.firstspringboot.components;

import java.sql.*;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private DataSource dataSource;

	public long count() {

		String countQuery = "SELECT COUNT(ID) FROM EMPLOYEE";
		return new JdbcTemplate(dataSource).queryForObject(countQuery, Long.class);
	}

	@Override
	public void deleteEmployee(int id) {

		String deleteQuery = "DELETE FROM EMPLOYEE WHERE ID=?";
		new JdbcTemplate(dataSource).update(deleteQuery, id);
	}

	@Override
	public void updateEmployee(Employee emp) {

		String updateQuery = "UPDATE EMPLOYEE SET NAME=?,AGE=?,EXPERIENCE=?,SALARY=? WHERE ID=?";
		new JdbcTemplate(dataSource).update(updateQuery, emp.getName(), emp.getAge(), emp.getExperience(),
				emp.getSeniority(), emp.getSalary());
	}

	@Override
	public void createEmployee(Employee emp) {

		String createQuery = "INSERT INTO EMPLOYEE (NAME,AGE,EXPERIENCE,SENIORITY,SALARY) VALUES(?,?,?,?,?)";
		new JdbcTemplate(dataSource).update(createQuery, emp.getName(), emp.getAge(), emp.getExperience(),
				emp.getSeniority(), emp.getSalary());
	}

	@Override
	public List<Employee> getAllEmployees() {

		String selectAllQuery = "SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE";
		return new JdbcTemplate(dataSource).query(selectAllQuery, new EmployeeRowMapper());
	}

	@Override
	public Employee getEmployee(int id) {

		String selectQuery = "SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE WHERE ID=?";
		return new JdbcTemplate(dataSource).queryForObject(selectQuery, new EmployeeRowMapper());
	}

	public class EmployeeRowMapper implements RowMapper<Employee> {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

			Employee e = new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setAge(rs.getInt(3));
			e.setExperience(rs.getInt(4));
			e.setSeniority(rs.getInt(5));
			e.setSalary(rs.getInt(6));
			return e;
		}
	}
}