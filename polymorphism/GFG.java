package polymorphism;

import java.io.IOException;

public class GFG{
    public static void main(String[] args) {
        // ParentStatic p = new ChildStatic();

         // Calls Parent's static method (hiding)
         
        // ParentStatic.staticMethod();
        // ChildStatic.staticMethod();
        
        // Calls Child's overridden instance method
        // p.instanceMethod(); 

        // create the object of child3 class 

        // Child3 c = new Child3();
        // Calls Child's method
        // c.display();

        // create the object of parent class access the diplay method 
        // Parent3 p = new Parent3();
        // p.diplay();

        //  Parent4 obj = new Child4();
        
        // Calls Child's method
        // obj.getObject();  

        // create the object of ParentExe class 

         // Parent reference, Child object
        ChildExe obj = new ChildExe(); 

        // ParentExe obj2 = new ParentExe();
        try{
            // Calls Child's overridden method
            obj.display();
            // Calls Parent's overridden method
            // obj2.display(); 
        } catch (IOException e){
            System.out.println("Exception caught: " + e.getMessage());
        }


    }
}