package service.demography;

import domain.demography.Race;
import service.service;

import java.util.Set;

public interface RaceService extends service<Race, Integer> {

    Set<Race> getAll();

}
