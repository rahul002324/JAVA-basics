import java.util.LinkedList;

public class train {
    public static void main(String[] args) {
        LinkedList <String> train = new LinkedList<String>();
        train.add("A"); 
        train.add("B");
        train.add("C");
        train.add("D");
        System.out.println("All train ticket : " + train);
        train.remove(2);
        train.add("E");
        System.out.println("final train ticket : " + train);
    }
    
}