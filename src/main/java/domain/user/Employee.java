package domain.user;

public class Employee {
    private int empNo;
    private String empFirstName;
    private String empLastName;

    private Employee (){ }

    public Employee(Builder builder){

        this.empNo = builder.empNo;
        this.empFirstName = builder.empFirstName;
        this.empLastName = builder.empLastName;

    }

    public int getEmpNo(){
        return empNo;
    }

    public void setEmpNo(int empNo){
        this.empNo = empNo;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName){
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName){
        this.empLastName = empLastName;
    }

    public static class Builder{

        private int empNo;
        private String empFirstName;
        private String empLastName;

        public Builder empNo(int empNo){

            this.empNo = empNo;
            return this;

        }

        public Builder empFirstName(String empFName){

            this.empFirstName = empFName;
            return this;

        }

        public Builder empLastName(String empLName){

            this.empLastName = empLName;
            return this;

        }

        public Employee build(){

            return new Employee(this);

        }

    }
}
