package polymorphism;

public class Main {
    public static void main(String[] args) {
        // Person p = new Person();
        // p.role();
        // create the object of father 
        // Father f = new Father();
        // f.role();

        // create the object of helper class 
        // System.out.println("Hello DK");
        // System.out.println(Helper.Multiply(2.2, 4.4));
        // System.out.println(Helper.Multiply(4,4));

        // create the object of parent1 class
        Parent1 a;
        
        // Now we will be calling print methods
        // inside main() method
        a = new SubClass1();
        a.Print();

        a = new SubClass2();
        a.Print();

    }
}
