class ATM{
    void withdaw(int amount){
        System.out.println("cost : " + amount);
    }
    void withdaw(int amount , String type){
        System.out.println("account : " + (amount +" " +  type));
    }
    public static void main(String[] args) {
        ATM a = new ATM();
        a.withdaw(15000);
        a.withdaw(25000, "Savings account");
    }
}