package service.user;

import domain.user.Employee;
import service.service;

import java.util.Set;

public interface EmployeeService extends service<Employee, Integer> {

    Set<Employee> getAll();

}
