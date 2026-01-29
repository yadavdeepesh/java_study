package static_non_static;
// Overriding 
// In the static method, we cannot override a static method, because of early binding. 

// Override of static method
class Parent {

    // static method
    static void show()
    {
        System.out.println("Parent");
    }
}

// Parent inherit in Child class
class Child extends Parent {

    // override show() of Parent
    void show()
    {
        System.out.println("Child");
    }
}

public class GFG {
    public static void main(String[] args)
    {
        Parent p = new Parent();
        // calling Parent's show()
        p.show();
        // cannot override Parent's show()
    }
}
