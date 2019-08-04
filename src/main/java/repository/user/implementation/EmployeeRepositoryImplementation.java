//Ryan Petersen

package repository.user.implementation;

import domain.user.Employee;
import repository.user.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImplementation implements EmployeeRepository {

    private static EmployeeRepositoryImplementation employeeRepository = null;
    private Set<Employee> employees;

    private EmployeeRepositoryImplementation(){

        employees = new HashSet<Employee>();
    }

    public static EmployeeRepositoryImplementation getEmployeeRepository() {

        if(employeeRepository == null){
            return new EmployeeRepositoryImplementation();
        }

        return employeeRepository;
    }

    public Set<Employee> getAll() {

        return employees;

    }

    public Employee create(Employee employee) {

        employees.add(employee);

        return employee;

    }

    public Employee read(Integer integer) {

        return employees.stream().filter(employee -> employee.getEmpNo() == integer).findAny().orElse(null);

    }

    public Employee update(Employee employee) {

        Employee toDelete = read(employee.getEmpNo());

        if(toDelete != null) {
            employees.remove(toDelete);
            return create(employee);
        }
        return null;
    }

    public void delete(Integer integer) {

        Employee toDelete = read(integer);
        if (toDelete != null){
            employees.remove(toDelete);
        }
    }
}
