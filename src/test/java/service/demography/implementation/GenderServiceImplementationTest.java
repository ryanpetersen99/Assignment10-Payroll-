//Ryan Petersen

package service.demography.implementation;

import domain.demography.Gender;
import factory.demography.GenderFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.demography.GenderService;

import java.util.Set;

public class GenderServiceImplementationTest {

    private GenderService service;

    @Before
    public void setUp() throws Exception {
        this.service = GenderServiceImplementation.getService();
    }

    @Test
    public void getAll() {

        Set<Gender> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Gender employee = GenderFactory.buildGender(1, "Male");

        service.create(employee);
        Gender gender = service.read(employee.getId());
        Assert.assertNotNull(gender);

        System.out.println(gender.toString());

    }

    @Test
    public void read() {

        Gender employee = GenderFactory.buildGender(1, "Male");

        service.create(employee);
        Gender gender = service.read(employee.getId());
        Assert.assertNotNull(gender);

        System.out.println(gender.toString());
    }

    @Test
    public void update() {

        Gender employee = GenderFactory.buildGender(1, "Male");

        service.create(employee);
        Gender gender = service.read(employee.getId());
        employee.setType("Female");
        service.update(employee);
        Assert.assertEquals(employee.getId(), gender.getId());

        System.out.println(gender.toString());

    }

    @Test
    public void delete() {

        Gender employee = GenderFactory.buildGender(1, "Male");

        service.create(employee);
        Gender gender = service.read(employee.getId());
        Assert.assertNotNull(gender);
        service.delete(employee.getId());
        Gender deleted = service.read(employee.getId());
        Assert.assertNull(deleted);

        System.out.println(gender.toString());

    }
}