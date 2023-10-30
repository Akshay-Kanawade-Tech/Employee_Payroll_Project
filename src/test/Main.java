package src.test;

import src.dao.FullTimeEmployee;
import src.dao.PartTimeEmployee;
import src.dao.PayRollSystem;

public class Main {

    public static void main(String[] args) {

        //creating object of Payrollsystem class
        PayRollSystem payRollSystem = new PayRollSystem();

        //adding full time employee

        FullTimeEmployee Employee1 = new FullTimeEmployee("Akshay",101,30000.0);

        //adding part-time employee

        PartTimeEmployee Employee2 = new PartTimeEmployee("shreyas",555,40,100);

        // adding employee in ArrayList
        payRollSystem.addEmployee(Employee1);
        payRollSystem.addEmployee(Employee2);

        System.out.println("Initial employee details: ");

        payRollSystem.displayEmployee();

        System.out.println("Removing Employee");

        payRollSystem.removeEmployee(555);

        System.out.println("Remaining employee details");
        payRollSystem.displayEmployee();

    }
}
