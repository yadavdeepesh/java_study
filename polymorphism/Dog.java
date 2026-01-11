package polymorphism;

class Dog extends Animal{
    @Override
    void move(){
        super.move();
        super.show();
        System.out.println("Dog is running ....");
    }
    @Override
    void eating(){
        System.out.println("Dog is eating....");
    }
    void bark(){
        System.out.println("Dog is barking....");
    }
    // @Override
    // void show(){
    //      System.out.println("do not override333...");
    // }
}
