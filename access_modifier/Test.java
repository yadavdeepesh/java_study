package access_modifier;

class Test {
    public static void main(String[] args) {
        // create the object of Geek 
        // Geek g = new Geek();
        // g.display();

        // create the object of vehicle class 
        Car c = new Car();
        c.setSpeed(100);
        System.out.println("Access via subclass method: "+ c.getSpeed());

        Vehicle v = new Vehicle();
        System.out.println(v.speed);
    }
}
