package Assignments.Assignment4;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new PartTimeEmployee("Lisa",999,1000.90,9,4);
        Employee emp2 = new FullTimeEmployee("Jisoo",998,500,0.0,500);
        Employee emp3 = new ContractEmployee("Jennie",997,500,6,6000);

        emp1.display();
        emp2.display();
        emp3.display();
    }
}
