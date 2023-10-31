package employeeJspProject.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import employeeJspProject.*;

public class DepartmentTableTest {

    private DepartmentDAO departmentTable;

    @Before
    public void setUp() {
        departmentTable = new DepartmentTable();

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testCreateDepartment() throws SQLException {
        Department newDepartment = new Department(7, "HR", "New York");

        departmentTable.createDepartment(newDepartment);

        Department retrievedDepartment = departmentTable.getDepartment(7);

        assertNotNull(retrievedDepartment);
        assertEquals(newDepartment.getDid(), retrievedDepartment.getDid());
        assertEquals(newDepartment.getDname(), retrievedDepartment.getDname());
        assertEquals(newDepartment.getDlocation(), retrievedDepartment.getDlocation());
    }

    @Test
    public void testGetAllDepartment() throws SQLException {
        Department department1 = new Department(8, "Sales", "New York");
        Department department2 = new Department(9, "IT", "San Francisco");

        departmentTable.createDepartment(department1);
        departmentTable.createDepartment(department2);

        List<Department> allDepartments = departmentTable.getAllDepartment();

        assertEquals(2, allDepartments.size());
    }

    @Test
    public void testUpdateDepartment() throws SQLException {
        Department newDepartment = new Department(10, "R&D", "New York");

        departmentTable.createDepartment(newDepartment);

        newDepartment.setDname("Finance");
        newDepartment.setDlocation("Chicago");

        departmentTable.updateDepartment(newDepartment);

        Department updatedDepartment = departmentTable.getDepartment(1);

        assertNotNull(updatedDepartment);
        assertEquals(newDepartment.getDid(), updatedDepartment.getDid());
        assertEquals(newDepartment.getDname(), updatedDepartment.getDname());
        assertEquals(newDepartment.getDlocation(), updatedDepartment.getDlocation());
    }

    @Test
    public void testDeleteDepartment() throws SQLException {

        Department newDepartment = new Department(11, "IT", "New York");

        departmentTable.createDepartment(newDepartment);

        departmentTable.deleteDepartment(11);

        Department deletedDepartment = departmentTable.getDepartment(11);

        assertNull(deletedDepartment);
    }
}
