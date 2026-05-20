package thread_study;
import java.util.concurrent.*;

public class ModernThread {
    public static void main(String[] args) {
         ExecutorService ex = Executors.newFixedThreadPool(2);

        ex.submit(() -> {
            System.out.println("Thread running");
        });

        ex.shutdown();
    }
    
}
