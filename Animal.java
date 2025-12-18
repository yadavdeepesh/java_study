public class Animal {
    void sound(){
        System.out.println("Animal makes the sounds..");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
class Cow extends Animal{
    void sound(){
         System.out.println("Cow moos");
    }
}
