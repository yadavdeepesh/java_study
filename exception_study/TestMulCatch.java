package exception_study;

public class TestMulCatch {
    public static void main(String[] args) {
        try{
            int arr[] = new int[3];
            arr[5] = 55;
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException"+ae);
        }
        catch(ArrayIndexOutOfBoundsException abe){
            System.out.println("Array index out of bound execption ");
        }
        catch(Exception e){
            System.out.println("parent exception");
        }
        finally {
            System.out.println("Finally Block Executed");
        }
    }
}
