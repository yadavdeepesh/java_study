package access_modifier;

class Car extends Vehicle{
    // using the protected member
      void setSpeed(int s){
        speed = s;
    }
    int getSpeed(){
        return speed;
    }
    
}
