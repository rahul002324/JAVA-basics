class shop{
    void product(String name){
            System.out.println("ordered : "+name);
    }
    void product(String name , int quantity){
            System.out.println("ordered : "+(name +" "+
                quantity));
    }
    public static void main(String[] args) {
        shop s = new shop();
        s.product("laptop");
        s.product("moblie",  3);
    }
}