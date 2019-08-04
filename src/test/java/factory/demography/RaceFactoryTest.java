package factory.demography;

import domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

public class RaceFactoryTest {

    @Test
    public void buildRace() {

        Race race = RaceFactory.buildRace(1, "Coloured");
        Assert.assertNotNull(race);

        System.out.println(race.toString());


    }
}