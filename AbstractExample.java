abstract class Collegee{
    abstract void Register();
    abstract void Infrastructure();
    abstract void Students();
    abstract void Staff();
    void medicalFaculty(){
        System.out.println("MEdical FAcilities are optional");
    }
}
     class KIETT extends Collegee{
        void Register(){
            System.out.println("Kiet is registered with AKTU");
        }
        void Infrastructure(){
            System.out.println("Kiet has digital");
        }
        void Students(){
            System.out.println("kiet has well trained students");
        }
        void Staff(){
            System.out.println("Kiet staff");
        }
        void medicalFaculty(){
            System.out.println("Keit has its own hospital");
        }
    }
public class AbstractExample{
    public static void main(String[] args) {
        Collegee cg;
        cg = new KIETT();
        cg.Infrastructure();
        cg.Register();
        cg.medicalFaculty();
        cg.Students();
        cg.Staff();
    }
}