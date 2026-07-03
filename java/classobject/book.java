class show {
    String name;
    String bookname;
    int price;
    
    void shows(){
        System.out.println("name:" + name);
        System.out.println("bookname:" + bookname);
        System.out.println("price:" + price);

    }

    
}
public class book {
    public static void main(String[] args) {
        show n01 = new show();
        n01.name = "son";
        n01.bookname = "cyber";
        n01.price = 200;
        
        show n02 = new show();
        n02.name ="json";
        n02.bookname = "trading";
        n02.price = 300;

        n01.shows();
        n02.shows();


    }
    
}
