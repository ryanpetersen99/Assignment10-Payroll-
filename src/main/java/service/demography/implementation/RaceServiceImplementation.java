package service.demography.implementation;

import domain.demography.Race;
import repository.demography.RaceRepository;
import repository.demography.implementation.RaceRepositoryImplementation;
import repository.demography.implementation.RaceRepositoryImplementation;
import service.demography.RaceService;

import java.util.Set;

public class RaceServiceImplementation implements RaceService {

    private static RaceServiceImplementation service = null;
    private RaceRepository repository;

    public RaceServiceImplementation() {
        repository = RaceRepositoryImplementation.getRaceRepository();
    }

    public static RaceServiceImplementation getService(){

        if(service == null){
            return new RaceServiceImplementation();
        }
        return service;
    }

    @Override
    public Set<Race> getAll() {
        return repository.getAll();
    }

    @Override
    public Race create(Race race) {
        return repository.create(race);
    }

    @Override
    public Race read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Race update(Race race) {
        return repository.update(race);
    }

    @Override
    public void delete(Integer integer) {
        repository.delete(integer);
    }
}
