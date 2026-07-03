class bank {
    String name;
    String IFSC;

    bank(String n , String I ){
         name = n;
         IFSC = I;
    }  
   void show(){
    System.out.println("name:" + name);
    System.out.println("IFS" + IFSC);
   }
}
public class Innerbank {
     public static void main(String[] args) {
          bank emp1 = new bank("rahul" , "009TMB");
          emp1.show();
          bank emp2 = new bank("naveem" , "10101TMB");
          emp2.show();
     }

    
}
