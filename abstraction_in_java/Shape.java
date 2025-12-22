package abstraction_in_java;

abstract class Shape {
    String color;
    //there are create the abstract methods
    public abstract double area();
    public abstract String toString();

    // absract class can contain constructor 
    public Shape(String color){
        System.out.println("Shape constructor is called..");
        this.color = color;
    }
    // this is concrete method ..
    public String getColor(){
        return color;
    } 
}
