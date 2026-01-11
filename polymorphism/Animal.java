package polymorphism;
// for overriding ...
// Overriding in Java
class Animal {
    void move(){
        System.out.println("Animal is moving..");
    }

    void eating(){
        System.out.println("Animal is eating..");
    }
     // Can't be overridden
    final void show(){
        System.out.println("do not override...");
    }
}
