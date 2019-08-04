//Ryan Petersen

package repository.demography.implementation;

import domain.demography.Gender;
import factory.demography.GenderFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.demography.GenderRepository;

import java.util.Set;

public class GenderRepositoryImplementationTest {

    private GenderRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImplementation.getGenderRepository();
    }


    @Test
    public void getAll() {

        Set<Gender> employeeSet = repository.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Gender employee = GenderFactory.buildGender(1, "Male");

        repository.create(employee);
        Gender gender = repository.read(employee.getId());
        Assert.assertNotNull(gender);

        System.out.println(gender.toString());

    }

    @Test
    public void read() {

        Gender employee = GenderFactory.buildGender(1, "Male");

        repository.create(employee);
        Gender gender = repository.read(employee.getId());
        Assert.assertNotNull(gender);

        System.out.println(gender.toString());
    }

    @Test
    public void update() {

        Gender employee = GenderFactory.buildGender(1, "Male");

        repository.create(employee);
        Gender gender = repository.read(employee.getId());
        employee.setType("Female");
        repository.update(employee);
        Assert.assertEquals(employee.getType(), gender.getType());

        System.out.println(gender.toString());

    }

    @Test
    public void delete() {

        Gender employee = GenderFactory.buildGender(1, "Male");

        repository.create(employee); //Create new gender
        Gender gender = repository.read(employee.getId()); //Reading details
        Assert.assertNotNull(gender);
        repository.delete(employee.getId()); //Deleting Gender
        Gender delete = repository.read(employee.getId());
        Assert.assertNull(delete); //Checking if deleted

        System.out.println(gender.toString());

    }
}