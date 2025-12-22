package abstraction_in_java;

interface Shape{
    // create the abstract method calculate the area 
    double calculateArea();
}
class Circle2 implements Shape {
    private double r;
     // Constructor for Circle
    public Circle2(double r){
        System.out.println("circle2 constructor is called");
        this.r = r;
    }
     // Implementing the abstract method 
    // from the Shape interface
    public double calculateArea(){
        return Math.PI*r*r;
    }
    
}
