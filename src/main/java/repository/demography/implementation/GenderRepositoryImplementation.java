package repository.demography.implementation;

import domain.demography.Gender;
import repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImplementation implements GenderRepository {


    private static GenderRepositoryImplementation genderRepository = null;
    private Set<Gender> genders;

    public GenderRepositoryImplementation(){

        genders = new HashSet<Gender>();

    }

    public static GenderRepositoryImplementation getGenderRepository() {

        if(genderRepository == null){
            return new GenderRepositoryImplementation();
        }

        return genderRepository;
    }


    @Override
    public Set<Gender> getAll(){

        return genders;

    }

    @Override
    public Gender create(Gender gender) {

        genders.add(gender);
        return gender;
    }

    @Override
    public Gender read(Integer integer) {

        return genders.stream().filter(gender -> gender.getId() == integer).findAny().orElse(null);

    }

    @Override
    public Gender update(Gender gender) {

        Gender genderToDelete = read(gender.getId());

        if(genderToDelete != null) {
            genders.remove(genderToDelete);
            return create(gender);
        }
        return null;

    }

    @Override
    public void delete(Integer integer) {

        Gender genderToDelete = read(integer);

        if(genderToDelete != null) {
            genders.remove(genderToDelete);
        }

    }




}
