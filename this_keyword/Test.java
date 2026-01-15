package this_keyword;

public class Test {
    public static void main(String args[]){
        // Car c = new Car();
        // c.display();

        // create object of student class..
        Student s = new Student();
        s.message();

          // calls student implementation
        // of isTrue()
        boolean result = s.isTrue();

        System.out.println(result);
    }
}
