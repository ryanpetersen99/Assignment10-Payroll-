package service.user.implementation;

import domain.user.EmployeeGender;
import repository.user.EmployeeGenderRepository;
import repository.user.implementation.EmployeeGenderRepositoryImplementation;
import service.user.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImplementation implements EmployeeGenderService {

    private static EmployeeGenderServiceImplementation service = null;
    private EmployeeGenderRepository repository;

    public EmployeeGenderServiceImplementation() {
        repository = EmployeeGenderRepositoryImplementation.getEmployeeGenderRepository();
    }

    public static EmployeeGenderServiceImplementation getService(){

        if(service == null){
            return new EmployeeGenderServiceImplementation();
        }
        return service;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return repository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return repository.create(employeeGender);
    }

    @Override
    public EmployeeGender read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return repository.update(employeeGender);
    }

    @Override
    public void delete(Integer integer) {

        repository.delete(integer);

    }
}
