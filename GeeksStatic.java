public class GeeksStatic {
    static String name;
    static float price;
    // create the setter methods
    public static void set(String n,float p){
        name = n;
        price = p;
    }
    // create the getter methods
    public static void get(){
        System.out.println("software name "+name);
        System.out.println("price "+price);
    }
    
    // create the main method 
    public static void main(String args[]){
        GeeksStatic.set("Vs Code ",200000f);
        GeeksStatic.get();
    }

    
}
