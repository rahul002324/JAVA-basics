class company{
    void companies(){
        System.out.println("company : ASUS");
    }
}
class leader extends company{
    void developteam(){
        System.out.println("project : Development");
    }
}
class emp extends leader{
    void empmember(){
        System.out.println("emp : developer");
    }
}
public class demo2 {

    public static void main(String[] args) {
        emp e = new emp();
        e.companies();
        e.developteam();
        e.empmember();
    }
}