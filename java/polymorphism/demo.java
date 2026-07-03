class addition{
    void add(int a , int b){
        System.out.println("sun" + (a + b));

    }

    void add(int a , int b , int c){
        System.out.println("sum"+ (a+b+c));
    }
}
public class demo {

    public static void main(String[] args) {
        addition a = new addition();
        a.add(50, 60);
        a.add(50, 60, 20);
    }
}