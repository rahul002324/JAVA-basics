import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        //add
        name.add("rahul");
        name.add("gokila");
        name.add("naveen");
        name.add("yazhin");
        name.add("sukuna");
        System.out.println("list the name : " + name);
        //get
        System.out.println("index value : " + name.get(2));
        //set
        name.set(3,"zein");
        //remove
        name.remove(2);
        //index value
        System.out.println("index of sukuna : " + name.indexOf("sukuna"));
        System.out.println("print final list : " + name);
    }
    
}