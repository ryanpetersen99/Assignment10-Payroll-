package factory.demography;

import domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {

    @Test
    public void getGender() {

        Gender gender = GenderFactory.buildGender(1, "Male");
        Assert.assertNotNull(gender);

        System.out.println(gender.toString());
    }
}