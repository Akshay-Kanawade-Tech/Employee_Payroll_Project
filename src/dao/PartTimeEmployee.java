package src.dao;

import src.domain.Employee;

public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double houlryRate;

    public PartTimeEmployee(String name, int id ,int hoursWorked,double houlryRate){

        super(name,id);
        this.hoursWorked =hoursWorked;
        this.houlryRate = houlryRate;
    }

    //oveririding abstract calculateSalary() method of Employee class

    @Override
    public double calculateSalary(){
        return hoursWorked * houlryRate;
    }
}
