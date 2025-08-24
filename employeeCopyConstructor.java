public class EmployeeCopyConstructor {
    int Emp_id;
    String Emp_name;
    EmployeeCopyConstructor(int id, String name) {
        Emp_id = id;
        Emp_name = name;
    }
    // Copy constructor
    EmployeeCopyConstructor(EmployeeCopyConstructor emp) {
        this.Emp_id = emp.Emp_id;
        this.Emp_name = emp.Emp_name;
    }
    void printInfo(){
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Employee Name: " + Emp_name);
    }
    public static void main(String[] args) {
        EmployeeCopyConstructor emp1 = new EmployeeCopyConstructor(101, "Vaishnavi");
        emp1.printInfo();
        EmployeeCopyConstructor emp2 =new EmployeeCopyConstructor(emp1); //Deep copy
        // EmployeeCopyConstructor emp2 ;
        // emp2 = emp1; (Shallow copy)
        emp2.printInfo();
        emp2.Emp_id = 102; // Changing emp2's ID
        emp2.Emp_name = "Shikha"; // Changing emp2's Name
        System.out.println("Details after changes");
        emp2.printInfo(); // Original object remains unchanged
        emp1.printInfo();
    }
}
