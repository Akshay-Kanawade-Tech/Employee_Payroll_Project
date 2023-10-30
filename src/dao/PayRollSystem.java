package src.dao;

import src.domain.Employee;

import java.util.ArrayList;

public class PayRollSystem {

    //used ArrayList to get Employee type data
    //each employee will be store in the form of employee object
    private ArrayList<Employee> employeeList;

    //constructor of this class
    public PayRollSystem() {
        employeeList = new ArrayList<>();
    }

    //passing employee type data becoz my arrayList can take employee data only

    //adding employee
    public void addEmployee(Employee employee) {

        //inbuilt arrayList method to add data in arrayList
        employeeList.add(employee);
    }

    //removing employee with help of emp_id
    public void removeEmployee(int id) {
        //taken variable named employeeToRemove of typed Employee
        Employee employeeToRemove = null;

        // for each loop to find employee from Arraylist

        for (Employee employee : employeeList) {

            //matching employee which i want to delete from employee List by using ID of employee
            if(employee.getId() == id){
                employeeToRemove = employee;
                break;
            }
        }
        //if employee value is not null then remove employee
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }

    //method to display employee

    public void  displayEmployee(){
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }

}
