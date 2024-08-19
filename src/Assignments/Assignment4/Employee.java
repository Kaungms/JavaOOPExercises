package Assignments.Assignment4;

public class Employee {
    private String name;
    private int employeeID;
    private double basicSalary;

    public Employee(String name, int employeeID, double basicSalary){
        this.name = name;
        this.employeeID = employeeID;
        this.basicSalary = basicSalary;

    }

    public double calculateSalary(){
        return this.basicSalary;
    }

    public double getBasicSalary(){
        return this.basicSalary;
    }

    public void display(){
        System.out.println("Employee name: "+this.name);
        System.out.println("Employee ID: "+this.employeeID);
        System.out.println("Basic Salary: "+this.basicSalary);
        System.out.println("Actual Salary: "+this.calculateSalary());
        System.out.println();
    }

}
