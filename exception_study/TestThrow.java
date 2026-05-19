package exception_study;
// throw Keyword
public class TestThrow {
    public static void main(String[] args) {
        // manually exception throw karna
        int age = 15;
        if( age < 18){
            throw new ArithmeticException("Not Eligible");
        }
        System.out.println("Eligible");
    }
}
