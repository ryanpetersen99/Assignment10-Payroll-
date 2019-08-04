//Ryan Petersen

package service.demography.implementation;

import domain.demography.Race;
import factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.demography.RaceService;

import java.util.Set;

public class RaceServiceImplementationTest {

    private RaceService service;

    @Before
    public void setUp() throws Exception {
        this.service = RaceServiceImplementation.getService();
    }

    @Test
    public void getAll() {

        Set<Race> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Race employee = RaceFactory.buildRace(1,"Other");

        service.create(employee);
        Race race = service.read(employee.getID());
        Assert.assertNotNull(race);

        System.out.println(race.toString());
    }

    @Test
    public void read() {

        Race employee = RaceFactory.buildRace(1,"Other");

        service.create(employee);
        Race race = service.read(employee.getID());
        Assert.assertNotNull(race);

        System.out.println(race.toString());
    }

    @Test
    public void update() {

        Race employee = RaceFactory.buildRace(1,"Other");

        service.create(employee);
        Race race = service.read(employee.getID());
        employee.setType("Coloured");
        service.update(employee);
        Assert.assertEquals(employee.getID(), race.getID());

        System.out.println(race.toString());

    }

    @Test
    public void delete() {

        Race employee = RaceFactory.buildRace(1,"Other");

        service.create(employee);
        Race race = service.read(employee.getID());
        Assert.assertNotNull(race);
        service.delete(employee.getID());
        Race deleted = service.read(employee.getID());
        Assert.assertNull(deleted);

        System.out.println(race.toString());
    }
}