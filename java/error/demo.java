import java.io.FileReader;
import java.io.IOException;


public class demo {
public static void readFile() throws IOException {
    FileReader in = new FileReader("intro.txt");
         
        System.out.println("file open succcessfully\n");
        int ch;
        while ((ch = in.read() )!= -1) {
            System.out.print((char)ch);
        }
        in.close();

}
 public static void main(String[] args) {
    try{
        readFile();
    } catch(IOException e){
        System.out.println("file not found");
    } 
 }   
}