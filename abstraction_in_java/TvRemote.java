package abstraction_in_java;

// create the abstract class for study
abstract class TV {
    // create the constructor in class
    TV(){
        System.out.println("I am using TV");
    }
    // create the abstract method..
    abstract void turnOn();
    abstract void turnOff();
}

public class TvRemote extends TV{
    @Override
    void turnOn(){
        System.out.println("On The TV..");
    }
    @Override
    void turnOff(){
        System.out.println("Off the TV");
    } 
}
