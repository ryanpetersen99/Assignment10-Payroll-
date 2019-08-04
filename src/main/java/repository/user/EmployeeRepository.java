package repository.user;

import domain.user.Employee;
import repository.repository;

import java.util.Set;

public interface EmployeeRepository extends repository<Employee, Integer> {

    Set<Employee> getAll();

}