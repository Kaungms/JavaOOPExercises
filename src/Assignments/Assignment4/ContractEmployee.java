package Assignments.Assignment4;

public class ContractEmployee extends Employee {
    private int contractDuration;
    private double contractAmount;

    public ContractEmployee(String name, int employeeID,double basicSalary,int contractDuration,int contractAmount){
        super(name,employeeID,basicSalary);
        this.contractDuration = contractDuration;
        this.contractAmount = contractAmount;

    }
    @Override
    public double calculateSalary(){
        return this.contractAmount/this.contractDuration;
    }

    @Override
    public void display(){
        System.out.println("***ContractTime Employee***");
        super.display();
    }
}
