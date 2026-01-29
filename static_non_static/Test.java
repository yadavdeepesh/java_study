package static_non_static;

public class Test {
    public static void main(String[] args) {
        // using static method ..
        //calling the static method ..  
        int res = Helper.sum(4, 9);
        System.out.println("Sum of 2 numbers "+res);

        // accessing the non static method 
        Helper h = new Helper();
        int num = h.numbers(55);
        System.out.println("enter number is "+num);
    }
}
