package abstraction_in_java;

public class Rectangle extends Shape {
    double length;
    double height;

    public Rectangle(String color,double length ,double height){
        super(color);
        System.out.println("Rectangle constructor is called");
        this.length = length;
        this.height = height;
    }
    @Override public double area(){
        return length*height;
    }
    @Override public String toString(){
         return "Rectangle color is " + super.getColor()
            + "and area is : " + area();
    }
    
}
