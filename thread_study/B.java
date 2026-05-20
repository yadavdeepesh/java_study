package thread_study;

public class B extends Thread{
       public void run() {

        for(int i=1; i<=5; i++) {
             try {
                Thread.sleep(1000);
            } catch(Exception e) {}

            System.out.println("B : " + i);
        }
    }
}
