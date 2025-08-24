// public class methodcode {
//     int id;
//     String name;
//     // public void displayMethod() {
//     //     System.out.println("Details are: "+id+" "+ name);
//     // }
//     methodcode(){
//          System.out.println("Details are: ");
//     }

// public static void main(String[] args) {
//     methodcode obj = new methodcode();
//     // obj.id = 1;
//     // obj.name = "shikha";
//     // obj.displayMethod();
// }
// }
//Create a class Employee with a non-parameterized method called getDetails() that takes employee details (name and salary) from the user and then Displays them


//Default constructor:
public class methodcode {
    int id;
    String name;
    methodcode(int m,String n){
         System.out.println("Details are: "+m+" "+n);
    }
    public void displayMethod() {
        System.out.println("Details are: "+id+" "+ name);
    }

public static void main(String[] args) {
    methodcode obj = new methodcode(21,"Shikha");
    // obj.id = 1;
    // obj.name = "Shikha";
    obj.displayMethod();
}
}