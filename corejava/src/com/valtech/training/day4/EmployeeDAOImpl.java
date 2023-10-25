package com.valtech.training.day4;

import java.sql.*;
import java.util.*;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	public long count() throws SQLException{
		
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT COUNT(ID) FROM EMPLOYEE");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			return rs.getLong(1);
		}
		con.close();
		return rs.getLong(1);
		
	}

	@Override
	public void deleteEmployee(int id) throws SQLException {

		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("DELETE FROM EMPLOYEE WHERE ID=?");
		ps.setInt(1, id);
		int rowsUpdated = ps.executeUpdate();
		System.out.println("Rows Updated:" + rowsUpdated);
		con.close();

	}

	@Override
	public void updateEmployee(Employee emp) throws SQLException {

		Connection con = getConnection();
		PreparedStatement ps = con
				.prepareStatement("UPDATE EMPLOYEE SET NAME=?,AGE=?,EXPERIENCE=?,SALARY=? WHERE ID=?");
		populatePreparedStatmentFromEmployee(emp, ps);
		ps.setInt(6, emp.getId());
		int rowsUpdated = ps.executeUpdate();
		System.out.println("Rows update:" + rowsUpdated);
		con.close();

	}


	@Override
	public void createEmployee(Employee emp) throws SQLException {
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO EMPLOYEE (NAME,AGE,EXPERIENCE,SENIORITY,SALARY) VALUES(?,?,?,?,?)");
		populatePreparedStatmentFromEmployee(emp, ps);
		int rowsUpdated = ps.executeUpdate();
		System.out.println("Rows update:" + rowsUpdated);
		con.close();

	}

	private void populatePreparedStatmentFromEmployee(Employee emp, PreparedStatement ps) throws SQLException {
		ps.setString(1, emp.getName());
		ps.setInt(2, emp.getAge());
		ps.setInt(3, emp.getExperience());
		ps.setInt(4, emp.getSeniority());
		ps.setInt(5, emp.getSalary());
	
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {

		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE");
		ResultSet rs = ps.executeQuery();
		List<Employee> emps = new ArrayList<>();
		while (rs.next()) {

			emps.add(mapRowToEmployee(rs));
		
		}

		con.close();
		return emps;

	}

	@Override
	public Employee getEmployee(int id) throws SQLException {

		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT ID,NAME,AGE,EXPERIENCE,SENIORITY,SALARY FROM EMPLOYEE WHERE ID=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {

			Employee e = mapRowToEmployee(rs);
			con.close();
			return e;

		} 
		else {

			System.out.println("No row with Id " + id + " found.");
			return null;

		}

	}

	private Employee mapRowToEmployee(ResultSet rs) throws SQLException {

		Employee e = new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setAge(rs.getInt(3));
		e.setExperience(rs.getInt(4));
		e.setSeniority(rs.getInt(5));
		e.setSalary(rs.getInt(6));
		return e;

	}

	static {

		try {

			Class.forName("com.mysql.jdbc.Driver");

		} 
		catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

	}

	private Connection getConnection() throws SQLException {

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/valtech2023?useSSL=false", "root", "root");

	}

	public static void main(String[] args) throws SQLException {

		EmployeeDAO dao = new EmployeeDAOImpl();
		System.out.println(dao.getEmployee(1));
		System.out.println(dao.getEmployee(2));
		System.out.println("----------------------");
		System.out.println(dao.getAllEmployees());
		System.out.println("----------------------");
		dao.createEmployee(new Employee(4,"Abhi", 30, 8, 4, 100000));
		System.out.println(dao.getEmployee(4));
		System.out.println("----------------------");
		dao.deleteEmployee(2);
		System.out.println(dao.getAllEmployees());
		System.out.println(dao.count());

	}

}