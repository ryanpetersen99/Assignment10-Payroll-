package domain.user;

public class EmployeeGender {
    private int id;
    private int empNo;

    public EmployeeGender(){

    }

    public int getGenderID() {
        return id;
    }

    public void setGenderID(int id) {
        this.id = id;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public EmployeeGender employeeGender(int empNo, int id){

        this.empNo = empNo;
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Employee Gender " + "\n" + "Employee Number: " + empNo + "\n" + "Gender id: " + id;
    }
}
