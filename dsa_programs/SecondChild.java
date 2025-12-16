package dsa_programs;

abstract class Demo {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

abstract class FirstChild extends Demo{
    public void m1(){
        System.out.println("m1");
    }

}
public class SecondChild extends FirstChild{
       public void m2(){
        System.out.println("m2");
    }
       public void m3(){
        System.out.println("m3");
    }
    
}
