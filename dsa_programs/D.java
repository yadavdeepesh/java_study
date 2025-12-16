package dsa_programs;

abstract class B {
    abstract class  C {
        abstract void myAbtractMethod();
    }
}
public class D extends B{
    class E extends C{
        void myAbtractMethod(){
            System.out.println("my abtract method ...");
        }
    }
}
