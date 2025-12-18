 package interfaces;
 class Vehicle {
     Vehicle(){
        System.out.println("Call Vehicle Constructor ...");
    }
 }
 class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}
 class Car extends Vehicle{
    Car(){
        System.out.println("Call Car Constructor ...");
    }
}