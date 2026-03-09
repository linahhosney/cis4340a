import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class R11_TPS00_J {
    public static void main(String[] args) {
        // Non-compliant: creates new thread for each task
        for (int i = 0; i < 3; i++) {
            new Thread(() -> System.out.println("Non-compliant thread")).start();
        }

        // Compliant: uses thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executor.submit(() -> System.out.println("Compliant thread pool"));
        }
        executor.shutdown();
    }
}