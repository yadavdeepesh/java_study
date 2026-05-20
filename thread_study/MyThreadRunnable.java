package thread_study;
// Implementing Runnable Interface
public class MyThreadRunnable implements Runnable{
    public void run(){
        System.out.println("thread is running..");
    }
    public static void main(String[] args) {
         MyThreadRunnable obj = new MyThreadRunnable();

         Thread ti = new Thread(obj);
         ti.run();

    }
}
