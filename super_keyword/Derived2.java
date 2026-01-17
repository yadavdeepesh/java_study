package super_keyword;
// study the topic of super keyword..
class Base2{
    int x;
    Base2(){
        x = 0;
    }
    Base2(int i){
        x = i;
    }
}
class Derived2 extends Base2{
    int y;
    Derived2(){
        y = 0;
    }
    Derived2(int i, int j){
        super(i);
        y = j;
    }
}
