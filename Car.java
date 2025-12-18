interface Vehicle{
    // private method for internal use 
    private void startEngine(){
        System.out.println("start the engine .....");
    }
    // defualt method use the private method ..
    default void drive(){
        startEngine();
        System.out.println("Vehicle is now driving...");
    }

}
public class Car implements Vehicle {
    
}
