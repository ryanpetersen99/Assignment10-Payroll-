//Ryan Petersen
package factory.demography;

import domain.demography.Race;

public class RaceFactory {
    public static Race buildRace(int id, String type)
    {
        return new Race.Builder().ID(id).type(type).build();
    }

}
