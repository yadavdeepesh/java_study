package polymorphism;

public class UseDemo {
   // Create the object of Demo class 
   public static void main(String[] args) {
       Demo obj = new Demo();
        obj.show((byte) 25); 
        obj.show("hello");    
        obj.show(250);       
        obj.show('A');  
        obj.show(7.5);
   }
}
