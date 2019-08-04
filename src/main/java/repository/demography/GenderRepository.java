package repository.demography;

import domain.demography.Gender;
import repository.repository;

import java.util.Set;

public interface GenderRepository extends repository<Gender, Integer> {

    Set<Gender> getAll();

}
