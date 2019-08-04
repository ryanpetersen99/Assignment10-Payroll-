//Ryan Petersen

package repository.user.implementation;

import domain.user.EmployeeGender;
import factory.user.EmployeeGenderFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.user.EmployeeGenderRepository;

import java.util.Set;

public class EmployeeGenderRepositoryImplementationTest {

    private EmployeeGenderRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImplementation.getEmployeeGenderRepository();
    }


    @Test
    public void getAll() {

        Set<EmployeeGender> employeeSet = repository.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

        repository.create(employee);
        EmployeeGender empGender = repository.read(employee.getEmpNo());
        Assert.assertNotNull(empGender);

        System.out.println(empGender.toString());

    }

    @Test
    public void read() {

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

        repository.create(employee);
        EmployeeGender empGender = repository.read(employee.getEmpNo());
        Assert.assertNotNull(empGender);

        System.out.println(empGender.toString());
    }

    @Test
    public void update() {

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

        repository.create(employee);
        EmployeeGender empGender = repository.read(employee.getEmpNo());
        employee.setEmpNo(2);
        repository.update(employee);
        Assert.assertEquals(employee.getEmpNo(), empGender.getEmpNo());

        System.out.println(empGender.toString());

    }

    @Test
    public void delete() {

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

        repository.create(employee);
        EmployeeGender empGender = repository.read(employee.getEmpNo());
        Assert.assertNotNull(empGender);
        repository.delete(employee.getEmpNo());
        EmployeeGender deleted = repository.read(employee.getEmpNo());
        Assert.assertNull(deleted);

        System.out.println(empGender.toString());

    }
}