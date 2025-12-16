package dsa_programs;
abstract class Base1{
    // create the final method can not be override 
    final void fun(){
        System.out.println("Fun function is called ...");
    }
    static void testwrite(){
        System.out.println("write some code.. function is called ...");
    }

}

class Derived extends Base1{
    // that is final method no need defined the body ...
}