class Employee{
    int id;
    String name;
    String Org;
    void details(){
        System.out.println("ID: "+id+" Name: "+name+" Organisation: "+Org);
    }
}
class Faculty extends Employee{
    String department;
    String subject;
    void displayFacultyDetails(){
        System.out.println( "Department: "+department+" Subject: "+subject);
    }

}
public class InheritanceSingle {
    public static void main(String[] args) {
        Faculty f = new Faculty();
        f.id=101;
        f.name="Shikha";
        f.Org="KIET Group of Institutions";
        f.department="CSE AIML";
        f.subject="Java";
        f.details();
        f.displayFacultyDetails();
    }
}
