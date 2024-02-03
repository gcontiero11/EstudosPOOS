package Aula3;

import Aula5.Ex04.Meeting;

public class Department {
    private String name;
    private int code;
    private String location;
    private int phoneExtension;
    private double budget;
    private Employee[] staff = new Employee[0];
    private Employee chief;


    public void addEmployee (Employee e){
        Employee[] newStaff = new Employee[staff.length + 1];
        int i = 0;
        for (Employee employee : staff) {
            newStaff[i] = employee;
            i++;
        }
        newStaff[newStaff.length - 1] = e;
        this.staff = newStaff;
    }
    public void removeEmployee (Employee e){
        Employee[] newStaff = new Employee[staff.length - 1];
        boolean flag = false;
        for (int i = 0; i<staff.length;i++){
            if (staff[i] == e){
                staff[i] = staff[staff.length - 1];
                flag = true;
            }
        }
        if (flag){
            for (int i = 0; i<newStaff.length; i++){
                newStaff[i] = staff[i];
                i++;
            }
            staff = newStaff;
        }
        else{
            System.out.println("Esta reuniao não está agendada");
        }
    }
    public void removeEmployee (long id){

    }
    public void listAllEmployees(){
    }
    public int sizeOfEmployees(){
        return -1;
    }
    public Employee getEmployee(long id){
        return null;
    }

}
