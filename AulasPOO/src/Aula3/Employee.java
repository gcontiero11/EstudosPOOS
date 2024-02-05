package Aula3;

public class Employee {
    private String name;
    protected long id;
    private double salary;
    private String jobTitle;
    private Department dept;
    private Department deptInCharge;

    public void printState(){
        System.out.println(String.format("Name: %s , Id: %d , Salary: %.2f , JobTitle: %s",name,id,salary,jobTitle));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", dept=" + dept +
                ", deptInCharge=" + deptInCharge +
                '}';
    }

    public double getAnnualSalary(){
        return salary * 12;
    }
}
