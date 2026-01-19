package static_study;

class Outer {
    static class Inner{
        void show(){
            System.out.println("Static Nested Class Method");
        }
    }
    public static void main(String args[]){
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
    
}
