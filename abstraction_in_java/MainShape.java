package abstraction_in_java;

public class MainShape {
    public static void main(String[] args) {

        // Reference type is the interface (Shape)
        Circle2 cir = new Circle2(5.0);
        Rectangle2 rect = new Rectangle2(4.0, 6.0);

        // Dynamic method dispatch — decides which method to call at runtime
        System.out.println("Area of Circle: " + cir.calculateArea());
        System.out.println("Area ofRectangle: " + rect.calculateArea());
    }
}
