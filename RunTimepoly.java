class employee{
    String Emp_name;
    void details(){
        System.out.println("  Emp ID: " + Emp_name);
    }
}
class staff extends employee{
    void details() {
        super.details();  // calls parent method
        System.out.println("Organisation: " + Emp_name);
    }
}
public class RunTimepoly{
    public static void main(String[] args) {
        staff s = new staff();//calls the method of child class
        s.Emp_name="Shikha";
        s.details();
    }
}
