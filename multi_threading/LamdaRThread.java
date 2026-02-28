package multi_threading;

// Example 4: Thread using Lambda Expression (Modern Java)
public class LamdaRThread {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("Thread using lambda running");
        });

        t1.start();
    }
}
