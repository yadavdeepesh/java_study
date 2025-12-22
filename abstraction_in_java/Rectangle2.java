package abstraction_in_java;

class Rectangle2 implements Shape{
// create the variable 
private double length;
private double width;

public Rectangle2(double length,double width){
    this.length = length;
    this.width = width;
}
public double calculateArea(){
    return length*width;
}
     
}