interface TestInterface {
    int a = 10;   // public static final by default

    default void display() {
        System.out.println("hello");
    }
     static void display2()
    {
        System.out.println("hello display 22");
    }
}

public class DefaultTest implements TestInterface {

    public static void main(String[] args) {
        DefaultTest t = new DefaultTest();
        t.display();
        TestInterface.display2();

    }
}
