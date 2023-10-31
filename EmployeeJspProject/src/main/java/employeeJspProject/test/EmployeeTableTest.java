package employeeJspProject.test;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import employeeJspProject.*;

import static org.junit.Assert.*;

import java.sql.SQLException;

public class EmployeeTableTest {

    private EmployeeDAO dao;

    @Before
    public void setUp() {
        dao = new EmployeeTable();
    }

    @After
    public void tearDown() {
        dao = null;
    }

    @Test
    public void testCreateEmployee() throws SQLException {
        Employee employee = new Employee(30, "John", 30, 5, 3, 60000, 1);
        dao.createEmployee(employee);

        Employee retrievedEmployee = dao.getEmployee(30);
        assertNotNull(retrievedEmployee);
        assertEquals("John", retrievedEmployee.getName());
        assertEquals(30, retrievedEmployee.getAge());
        assertEquals(5, retrievedEmployee.getExperience());
        assertEquals(3, retrievedEmployee.getSeniority());
        assertEquals(60000, retrievedEmployee.getSalary());
        assertEquals(1, retrievedEmployee.getDid());
    }

    @Test
    public void testUpdateEmployee() throws SQLException {
        Employee employee = new Employee(31, "Jane", 28, 3, 2, 55000, 2);
        dao.createEmployee(employee);

        Employee updatedEmployee = new Employee(31, "Jane Doe", 29, 4, 3, 60000, 3);
        dao.updateEmployee(updatedEmployee);

        Employee retrievedEmployee = dao.getEmployee(31);
        assertNotNull(retrievedEmployee);
        assertEquals("Jane Doe", retrievedEmployee.getName());
        assertEquals(29, retrievedEmployee.getAge());
        assertEquals(4, retrievedEmployee.getExperience());
        assertEquals(3, retrievedEmployee.getSeniority());
        assertEquals(60000, retrievedEmployee.getSalary());
        assertEquals(3, retrievedEmployee.getDid());
    }

    @Test
    public void testDeleteEmployee() throws SQLException {
        Employee employee = new Employee(33, "Bob", 35, 10, 5, 75000, 4);
        dao.createEmployee(employee);

        dao.deleteEmployee(33);

        Employee retrievedEmployee = dao.getEmployee(33);
        assertNull(retrievedEmployee);
    }

    @Test
    public void testGetEmployee() throws SQLException {
        Employee employee = new Employee(34, "Alice", 25, 2, 1, 50000, 5);
        dao.createEmployee(employee);

        Employee retrievedEmployee = dao.getEmployee(34);

        assertNotNull(retrievedEmployee);
        assertEquals("Alice", retrievedEmployee.getName());
        assertEquals(25, retrievedEmployee.getAge());
        assertEquals(2, retrievedEmployee.getExperience());
        assertEquals(1, retrievedEmployee.getSeniority());
        assertEquals(50000, retrievedEmployee.getSalary());
        assertEquals(5, retrievedEmployee.getDid());
    }
}
