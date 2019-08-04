package repository.user;

import domain.user.EmployeeGender;
import repository.repository;

import java.util.Set;

public interface EmployeeGenderRepository extends repository<EmployeeGender, Integer> {

    Set<EmployeeGender> getAll();

}
