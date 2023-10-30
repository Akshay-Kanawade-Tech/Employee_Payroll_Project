package src.domain;

public abstract  class Employee {

    private String name;
    private int id;

    //constructor of this class

    public Employee(String name ,int id){
        this.name =name;
        this.id =id;
    }

    //getter's, and encapsulation not giving direct access of variable
    public String getName(){
        return  name;
    }
    public  int getId(){
        return id;
    }

    //making abstract method(just declaration with abstract and at last semicolon)
    protected abstract double calculateSalary();

    //overriding toString() method

    @Override
    public String toString(){
        return "Employee [name="+name+", id ="+id+",salary="+calculateSalary()+"]";
    }
}
