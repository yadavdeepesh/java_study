package polymorphism;
// Method Overloading
// 1. Compile-Time Polymorphism
class Helper {
    static int Multiply(int a, int b){
        return a * b;
    }
    static double Multiply(double a, double b){
        return a * b;
    }
}
