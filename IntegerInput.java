import java.util.Scanner;
public class IntegerInput {
    public static void main(String args[]){
        // create the scanner object 
        Scanner kb = new Scanner(System.in);

        System.out.println("enter the integer value ...");
        int num = kb.nextInt();
        System.out.println("user enter value is "+num);
        kb.close();
    }

    
}