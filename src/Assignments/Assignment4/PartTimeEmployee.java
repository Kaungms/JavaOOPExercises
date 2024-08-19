package Assignments.Assignment4;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int employeeID, double basicSalary,int hoursWorked,int hourlyRate){
        super(name,employeeID,basicSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return this.hourlyRate*this.hoursWorked;
    }
    @Override
    public void display(){
        System.out.println("***PartTime Employee***");
        super.display();
    }
}
