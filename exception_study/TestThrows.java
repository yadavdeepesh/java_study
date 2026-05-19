package exception_study;
import java.io.*;
public class TestThrows {
    static void readFile() throws IOException {
        FileReader file = new FileReader("abc.txt");
    }
    public static void main(String[] args) {
       try{
        readFile();
       }
       catch(IOException e){
        System.out.println(e);
       } 
    }
}
