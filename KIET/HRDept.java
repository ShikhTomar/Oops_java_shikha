package KIET;

public class HRDept {
    public static void main(String[] args) {
        EmployeeKiet emp = new EmployeeKiet();
        emp.Emp_Name = "Vaishnavi";
        emp.Emp_id = 123;
        emp.Salary = 50000;
        emp.organisation = "KIET Group of Institutions";
        emp.employeeDetails();
    }
}
