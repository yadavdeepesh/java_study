package multi_threading;

public class Test {
    public static void main(String[] args) {      
        // create the object of mythread class 
      
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();  // starts a new thread
        t2.start();
    }
}
