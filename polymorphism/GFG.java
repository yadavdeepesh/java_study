package polymorphism;

public class GFG{
    public static void main(String[] args) {
        ParentStatic p = new ChildStatic();

         // Calls Parent's static method (hiding)
        ParentStatic.staticMethod();
        
        // Calls Child's overridden instance method
        p.instanceMethod(); 
    }
}