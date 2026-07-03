class bank {
    void bankmethod(){
        System.out.println("bank name : TMB");
    }
}
class account extends bank{
    void accountmethod(){
        System.out.println("Account name : 009TMB");
    }
}
class amount extends account{
    void amountvale(){
        System.out.println("Amount : 150000");
    }
}
public class demo3 {

    public static void main(String[] args) {
        amount a = new amount();
        a.bankmethod();
        a.accountmethod();
        a.amountvale();
    }
}