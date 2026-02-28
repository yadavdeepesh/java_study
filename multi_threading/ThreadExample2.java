package multi_threading;

public class ThreadExample2 {
    public static void main(String[] args) {

        MyRunnable task = new MyRunnable();

        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");

        t1.start();
        t2.start();
    }
}
