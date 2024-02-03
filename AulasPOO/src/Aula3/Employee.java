package Aula3;

public class Employee {
    private String name;
    private long id;
    private double salary;
    private String jobTitle;
    private Department dept;
    private Department deptInCharge;

    public void printState(){
        System.out.println(String.format("Name: %s , Id: %d , Salary: %.2f , JobTitle: %s",name,id,salary,jobTitle));
    }
    public double getAnnualSalary(){
        return salary * 12;
    }
}
