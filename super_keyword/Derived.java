package super_keyword;

class Base{
    int x = 10;
}
class Derived extends Base{
    int x = 20;
    void printData(){
        System.out.println(super.x);
        System.out.println(x);
    }
    
}
