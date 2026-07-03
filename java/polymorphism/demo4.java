class emp{
    void income(int pay){
        System.out.println("salary : " + pay);
    }
    void income(int pay , int extrapay){
        System.out.println("salary & bonus : " + (pay + " " + extrapay));
    }
    public static void main(String[] args) {
        emp e = new emp();
        e.income(15000);
        e.income(15000, 5000);
    }
}