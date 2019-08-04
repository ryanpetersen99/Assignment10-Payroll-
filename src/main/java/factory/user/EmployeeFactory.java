package factory.user;

import domain.user.Employee;

public class EmployeeFactory {

    public static Employee getEmployee(int empNo, String fName, String lName ){

        return new Employee.Builder().empNo(empNo).empFirstName(fName).empLastName(lName).build();
    }
}
