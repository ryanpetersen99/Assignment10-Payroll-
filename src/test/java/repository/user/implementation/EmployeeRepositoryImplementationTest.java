//Ryan Petersen

package repository.user.implementation;

import domain.user.Employee;
import factory.user.EmployeeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.user.EmployeeRepository;

import java.util.Set;

public class EmployeeRepositoryImplementationTest {

    private EmployeeRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImplementation.getEmployeeRepository();
    }


    @Test
    public void getAll() {

        Set<Employee> employeeSet = repository.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Employee employee = EmployeeFactory.getEmployee(1, "Ryan", "Petersen");
        repository.create(employee);
        Employee emp = repository.read(employee.getEmpNo());
        Assert.assertNotNull(emp);

        System.out.println(emp.toString());

    }

    @Test
    public void read() {

        Employee employee = EmployeeFactory.getEmployee(1, "Ryan", "Petersen");

        repository.create(employee);
        Employee emp = repository.read(employee.getEmpNo());
        Assert.assertNotNull(emp);

        System.out.println(emp.toString());
    }

    @Test
    public void update() {

        Employee employee = EmployeeFactory.getEmployee(1, "Ryan", "Petersen");

        repository.create(employee);
        Employee emp = repository.read(employee.getEmpNo());
        employee.setEmpFirstName("Kyle");
        repository.update(employee);
        Assert.assertEquals(employee.getEmpNo(), emp.getEmpNo());

        System.out.println(emp.toString());

    }

    @Test
    public void delete() {

        Employee employee = EmployeeFactory.getEmployee(1, "Ryan", "Petersen");

        repository.create(employee);
        Employee emp = repository.read(employee.getEmpNo());
        Assert.assertNotNull(emp);
        repository.delete(employee.getEmpNo());
        Employee deleted = repository.read(employee.getEmpNo());
        Assert.assertNull(deleted);

        System.out.println(emp.toString());

    }
}