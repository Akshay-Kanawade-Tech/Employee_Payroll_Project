package src.dao;

import src.domain.Employee;

public class FullTimeEmployee extends Employee {

    private double monthly_salary;

    //constructor of this class

    public FullTimeEmployee(String name ,int id,double monthly_salary){

       //used super() to call parent class constructor parameters
        super(name,id);
        this.monthly_salary =monthly_salary;
    }

    //overriding calculateSalary() method which is abstract method in Employee class
    @Override
     public double calculateSalary(){
        return monthly_salary;
     }

}
