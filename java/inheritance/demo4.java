class hospital{
    void name(){
        System.out.println("ABC hospital");
    }
}
class doctor extends hospital{
    void doctor1(){
        System.out.println("doctor attending patient ");
    }
}
class nurse extends hospital{
        void nurse1(){
            System.out.println("nurse attending patient");
        }
}
public class demo4 {

    public static void main(String[] args) {
            doctor d = new doctor();
            d.name();
            d.doctor1();
            
            nurse n = new nurse();
            n.name();
            n.nurse1();
    }
}