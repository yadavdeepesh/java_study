package polymorphism;

class ChildStatic extends ParentStatic{
    static void staticMethod(){
        // Hides Parent's static method
        System.out.println("child static methods... ");
    }
    @Override
    void instanceMethod(){
          // Overrides Parent's instance method
        System.out.println("Child instance method");
    }
}
