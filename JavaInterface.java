
import java.io.*;

// declare interface
interface Test {
    void display();
}

class JavaTest implements Test {
    public void display() {
        System.out.println("hhh");
    }
}

public class JavaInterface {
    public static void main(String args[]) {
        JavaTest obj = new JavaTest();
        obj.display();
    }
}

