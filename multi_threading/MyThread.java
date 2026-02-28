package multi_threading;
// Example 1: Creating Threads by Extending Thread Class
public class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(500); // pause for 500 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
