package this_keyword;
// Super keyword with variable 
class Car extends Vehicle{
    int maxSpeed = 180;
    void display(){
        System.out.println("Max Speed of vehicle class  "+ super.maxSpeed);
        System.out.println("Max Speed of car class  "+ maxSpeed);
    }
    
}
