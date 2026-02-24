package multi_threading;

class ThreadTest extends Thread {
    public void run() {
        try {
            System.out.println("Thread " +
                    Thread.currentThread().threadId() +
                    " is running");

        } catch (Exception e) {
            System.out.println("Exception is caught " + e);
        }
    }
}
