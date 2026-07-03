class phone{
    void model(){
        System.out.println("secure phone");
    }
}
class phone1 extends phone{
    void type1(){
        System.out.println("android");
    }
}
class phone2 extends phone{
    void type2(){
        System.out.println("iphone");
    }
}
public class demo5 {

    public static void main(String[] args) {
        phone1 p = new phone1();
        p.model();
        p.type1();
        phone2 b = new phone2();
        b.model();
        b.type2();
    }
}