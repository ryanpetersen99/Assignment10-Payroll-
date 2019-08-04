//Ryan Petersen

package repository.user.implementation;

import domain.user.EmployeeGender;
import repository.user.EmployeeGenderRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepositoryImplementation implements EmployeeGenderRepository {


    private static EmployeeGenderRepositoryImplementation employeeGenderRepository = null;
    private Set<EmployeeGender> employeeGenders;

    private EmployeeGenderRepositoryImplementation(){

        employeeGenders = new HashSet<EmployeeGender>();

    }

    public static EmployeeGenderRepositoryImplementation getEmployeeGenderRepository() {

        if(employeeGenderRepository == null){
            return new EmployeeGenderRepositoryImplementation();
        }

        return employeeGenderRepository;
    }

    public Set<EmployeeGender> getAll() {

        return employeeGenders;

    }

    public EmployeeGender create(EmployeeGender employeeGender) {

        employeeGenders.add(employeeGender);

        return employeeGender;

    }

    public EmployeeGender read(Integer integer) {

        return employeeGenders.stream().filter(employeeGender -> employeeGender.getEmpNo() == integer).findAny().orElse(null);

    }

    public EmployeeGender update(EmployeeGender employeeGender) {

        EmployeeGender toDelete = read(employeeGender.getEmpNo());

        if(toDelete != null) {
            employeeGenders.remove(toDelete);
            return create(employeeGender);
        }
        return null;
    }

    public void delete(Integer integer) {

        EmployeeGender toDelete = read(integer);
        if (toDelete != null){
            employeeGenders.remove(toDelete);
        }

    }

}
