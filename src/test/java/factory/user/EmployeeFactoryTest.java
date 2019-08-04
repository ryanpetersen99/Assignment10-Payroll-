//Ryan Petersen

package factory.user;

import domain.user.Employee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeFactoryTest {

    @Test
    public void getEmployee() {

        Employee emp = EmployeeFactory.getEmployee(1, "Ryan", "Petersen");
        Assert.assertNotNull(emp);
        System.out.println(emp.toString());
    }
}