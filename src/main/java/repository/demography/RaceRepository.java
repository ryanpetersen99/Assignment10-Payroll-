package repository.demography;

import domain.demography.Race;
import repository.repository;

import java.util.Set;

public interface RaceRepository extends repository<Race, Integer> {

    Set<Race> getAll();

}
