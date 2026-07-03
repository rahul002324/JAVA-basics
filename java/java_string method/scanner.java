import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner rahul = new Scanner(System.in);
         System.out.print("enter first num");
         int a = rahul.nextInt();
        System.out.print("enter second num");
        int b = rahul.nextInt();
        System.out.print("enter opertor (+,-,*,/)");
        char hee = rahul.next().charAt(0);
    switch (hee) {
        case '+':
            System.out.println("result = " + (a + b));
            break;
        case '-':
            System.out.println("result = " + (a - b));
            break;
        case '*':
            System.out.println("result = " + (a * b));
            break;
        case '/':
            System.out.println("result = " + (a / b));  
            break;
        default:
        System.out.println("error");
    }



    }
}
