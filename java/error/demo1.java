import java.util.Scanner;
public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = 5000;
        try {
            System.out.println("enter withdaw amount");
            int amo = sc.nextInt();
               if(amo > bal){
                throw new  ArithmeticException("insufficient balance");
               }
               bal = bal - amo;
               System.out.println("remaining balance = " + bal);
        }
        catch (Exception e) {
            // TODO: handle exception
        }
    }
}