import java.util.ArrayList;
import java.util.Scanner;

public class marklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> marks = new ArrayList<>();
        System.out.println("enter marks" + sc);
        int mark =sc.nextInt();
        int highest=0;
        for(int i=0;i<6;i++){
            marks.add(mark);
            if(mark>highest){
                highest=mark;
            }
        }
        System.out.println("Highest mark: " + highest);
        marks.set(2,50);
        System.out.println("lowest marks: " + marks);
        marks.remove(4);
        System.out.println("final marks : " + marks);
    }
    
}
