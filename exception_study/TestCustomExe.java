package exception_study;

class MyException extends Exception {

    MyException(String msg) {
        super(msg);
    }
}
public class TestCustomExe {
    public static void main(String[] args) {
         try {

            int amount = 500;

            if(amount < 1000) {
                throw new MyException("Insufficient Balance");
            }
            System.out.println("balance Amount = "+amount);

        } 
        catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
