public class EmployeeSttatic {
    int Emp_ID;
    static String Org;
    static{
        Org = "KIET Group of Institutions";
        System.out.println("Static block executed. Organisation set to: " + Org);
    }
    void details(){
        System.out.println("ID: "+Emp_ID+" Organisation: "+Org);
    }
    public static void main(String[] args) {
        EmployeeSttatic emp = new EmployeeSttatic();
        emp.Emp_ID = 101;
        emp.Org = "KIET Group of Institutions";
        emp.details();
        EmployeeSttatic emp1 = new EmployeeSttatic();
        emp1.Emp_ID = 102;
        emp1.details();
    }
}
