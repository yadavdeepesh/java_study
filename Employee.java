
abstract class Sunstar{
       Sunstar(){
        System.out.println("Sunstar Contructor call ...");
    }
    // create the abstract method ..
    abstract void printInfo();
}
public class Employee extends Sunstar{
    public void printInfo(){
        System.out.println("that is abstarct method..");
    }
}

    
