package service.demography;

import domain.demography.Gender;
import service.service;

import java.util.Set;

public interface GenderService extends service<Gender, Integer> {

    Set<Gender> getAll();

}
