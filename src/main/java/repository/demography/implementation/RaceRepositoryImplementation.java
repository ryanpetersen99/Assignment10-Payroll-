//Ryan Petersen

package repository.demography.implementation;

import domain.demography.Race;
import repository.demography.RaceRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepositoryImplementation implements RaceRepository {

    private static RaceRepositoryImplementation raceRepository = null;
    private Set<Race> races;

    public RaceRepositoryImplementation(){
        races = new HashSet<Race>();
    }

    public static RaceRepositoryImplementation getRaceRepository() {

        if(raceRepository == null){
            return new RaceRepositoryImplementation();
        }
        return raceRepository;
    }


    @Override
    public Set<Race> getAll() {
        return races;
    }

    @Override
    public Race create(Race race) {
        races.add(race);
        return race;
    }

    @Override
    public Race read(Integer integer) {
        return races.stream().filter(race -> race.getID() == integer).findAny().orElse(null);
    }

    @Override
    public Race update(Race race) {

        Race raceToDelete = read(race.getID());

        if(raceToDelete != null) {
            races.remove(raceToDelete);
            return create(race);
        }
        return null;
    }

    @Override
    public void delete(Integer integer) {
        Race raceToDelete = read(integer);

        if(raceToDelete != null) {
            races.remove(raceToDelete);
        }
    }
}
