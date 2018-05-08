package Task8.Task8_3;


import java.util.Date;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MapWriter(hashMap));
        }
        Thread[] threadsReaders = new Thread[10];
        for (int i = 0; i < threadsReaders.length; i++) {
            threadsReaders[i] = new Thread(new MapReader(hashMap));
        }
        Date start = new Date();
        for (Thread thread : threads) {
            thread.start();
            thread.join();
        }
        for (Thread thread : threadsReaders) {
            thread.start();
            thread.join();
        }
        Date finish = new Date();

        System.out.println("Time with HashMap " + (finish.getTime() - start.getTime()) + " ms");
    }
}
