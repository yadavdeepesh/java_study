package abstraction_in_java;

class Circle extends Shape  {

    double radius;
    public Circle(String color,double radius){
        super(color);
        System.out.println("Circle constructor is called");
        this.radius = radius;
    }
    @Override public double area(){
    return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString() {
    return "Color: " + color + ", Area: " + area();
    }

}
