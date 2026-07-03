class college{
    void collegementod(){
        System.out.println("college name : rathinam");
    }
}
class manager extends college{
    void managermenthod(){
        System.out.println("manager : hiring teacher");
    }
}
class teacher extends manager{
    void teachmenthod(){
        System.out.println("teach : professor");
    }
}
public class demo1 {

    public static void main(String[] args) {
        teacher t = new teacher();
        t.collegementod();
        t.managermenthod();
        t.teachmenthod();
    }
}