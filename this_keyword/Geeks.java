package this_keyword;

public class Geeks {
    int a;
    int b;

    // create default constructor 
    Geeks(){
        this(10,20);
        System.out.println("Inside default constructor ..");
    }
    // parameterized constructor 
    Geeks(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor..");
    }
    public static void main(String[] args) {
        Geeks g = new Geeks();
    }
}
