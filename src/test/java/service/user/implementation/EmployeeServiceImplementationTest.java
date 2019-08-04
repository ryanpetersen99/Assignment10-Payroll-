//Ryan Petersen

package service.user.implementation;

import domain.user.Employee;
import factory.user.EmployeeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.user.EmployeeService;

import java.util.Set;

public class EmployeeServiceImplementationTest {

    private EmployeeService service;

    @Before
    public void setUp() throws Exception {
        this.service = EmployeeServiceImplementation.getService();
    }

    @Test
    public void getAll() {

        Set<Employee> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Employee employee = EmployeeFactory.getEmployee(1, "Ryan", "Petersen");

        service.create(employee);
        Employee emp = service.read(employee.getEmpNo());
        Assert.assertNotNull(emp);
        System.out.println(employee);

        System.out.println(emp.toString());

    }

    @Test
    public void read() {

        Employee employee = EmployeeFactory.getEmployee(1, "Ryan", "Petersen");

        service.create(employee);
        Employee emp = service.read(employee.getEmpNo());
        Assert.assertNotNull(emp);

        System.out.println(emp.toString());
    }

    @Test
    public void update() {

        Employee employee = EmployeeFactory.getEmployee(1, "Ryan", "Petersen");

        service.create(employee);
        Employee emp = service.read(employee.getEmpNo());
        employee.setEmpFirstName("Kyle");
        service.update(employee);
        Assert.assertEquals(employee.getEmpNo(), emp.getEmpNo());

        System.out.println(emp.toString());
    }

    @Test
    public void delete() {

        Employee employee = EmployeeFactory.getEmployee(1, "Ryan", "Petersen");

        service.create(employee);
        Employee emp = service.read(employee.getEmpNo());
        Assert.assertNotNull(emp);
        service.delete(employee.getEmpNo());
        Employee deleted = service.read(employee.getEmpNo());
        Assert.assertNull(deleted);

        System.out.println(emp.toString());
    }
}