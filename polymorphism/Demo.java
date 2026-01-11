package polymorphism;
// What if the Exact Prototype Does Not Match?
class Demo {
    public void show(int x){
        System.out.println("In Int "+x);
    }
    public void show(double x){
        System.out.println("In Double "+x);
    }
    public void show(String s){
        System.out.println("In String "+s);
    }
    public void show(byte b){
        System.out.println("In byte "+b);
    }
}
