package KIET;

public class EmployeeKiet {
    public String Emp_Name;
    private int Salary;
    protected int Emp_id;
    String organisation; //deafult access modifier
    void employeeDetails(){
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Salary: " + Salary);
        System.out.println("Organisation: " + organisation);
    }
    public static void main(String[] args) {
        EmployeeKiet emp = new EmployeeKiet();
        emp.Emp_Name = "Vaishnavi";
        emp.Emp_id = 123;
        emp.Salary = 50000;
        emp.organisation = "KIET Group of Institutions";
        emp.employeeDetails();
    }
}
