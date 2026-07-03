import java.util.LinkedList;
import java.util.Scanner;
class node{
    String data;
    node next;
    node(String data){
        this.data = data;
        this.next = null;
    }
}
public class music {
    public static void main(String[] args) {
        LinkedList <String> song = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Listen your song: ");
        String music = sc.nextLine();
        song.add(music);
        for(int i = 0; i < 5; i++){
            System.out.println("Listen your song: ");
            String music1 = sc.nextLine();
            song.add(music1);
        }
        System.out.println("list of music : " + song);
        System.out.println("chose your music : " + song.get(0));
        System.out.println("your music is playing");
    }
}