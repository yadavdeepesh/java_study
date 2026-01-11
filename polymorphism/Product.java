package polymorphism;
// Method Overloading in Java
// 1. Changing the Number of Parameters
class Product {

  public int multiply(int a){
    return a;
  }
   // Multiplying two integer values
   public int multiply(int a , int b){
    int res = a * b;
    return res;
   }
   // Multiplying three integer values
   public int multiply( int a,int b, int c){
    int res = a * b * c;
    return res;
   }
    
}
