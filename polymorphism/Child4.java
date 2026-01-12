package polymorphism;

class Child4 extends Parent4{
    @Override
    // Covariant return type
    Child4 getObject() {  
        System.out.println("Child4 object");
        return new Child4();
    }
}
