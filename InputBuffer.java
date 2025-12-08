
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBuffer {
    public static void main(String args[]) throws IOException {
        
            // step 1 . create the input buffer object 
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // step 2 . enter the user input
            System.out.print("enter an integer ");

            //step 3. read and parse intput
            int number = Integer.parseInt(reader.readLine());

            // step 4. print the enter integer value ..
            System.out.println("You entered: " + number);


    }
    
}
