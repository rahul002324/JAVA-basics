class animal{
    void pets(){
        System.out.println("pets : cat");
    }
}
class forest extends animal{
        void wildpets(){
            System.out.println("wildpets : lion");
        }
}
public class demo {

    public static void main(String[] args) {
        forest a = new forest();
        a.pets();
        a.wildpets();
    }
}