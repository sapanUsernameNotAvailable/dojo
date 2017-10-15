package lang.threadpool;

import org.junit.Test;

import java.util.stream.IntStream;

public class ExecutorServiceTest {

    @Test
    public void demo() throws Exception {

        ExecutorService service = ExecutorServiceFactory.getService(3);

        IntStream.range(0,15).forEach(i-> {service.submit(() -> {
            System.out.println("Started task count : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished task count : " + i);
        });});


        Thread.sleep(7500); // 500*15 = worst case single thread execution time.
    }
}
