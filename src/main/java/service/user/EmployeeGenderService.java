package service.user;

import domain.user.EmployeeGender;
import service.service;

import java.util.Set;

public interface EmployeeGenderService extends service<EmployeeGender, Integer> {

    Set<EmployeeGender> getAll();
}
