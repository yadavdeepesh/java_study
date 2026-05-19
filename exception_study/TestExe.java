package exception_study;

public class TestExe {
    public static void main(String[] args) {
        try{
        int a = 10/0;
        System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divded by zero ");
        }
         System.out.println("Program Continue");
    }
}
