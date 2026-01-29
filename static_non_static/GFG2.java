package static_non_static;

// Override of non-static method

class Parent1 {
    void show()
    {
        System.out.println("Parent");
    }
}

// Parent inherit in Child class
class Child1 extends Parent1 {

    // override show() of Parent
    void show()
    {
        System.out.println("Child");
    }
}

public class GFG2 {
    public static void main(String[] args)
    {
        Parent1 p = new Parent1();
        // calling Parent's show()
        p.show();

        Parent1 c = new Child1();
        // calling Child's show()
        c.show();
    }
}