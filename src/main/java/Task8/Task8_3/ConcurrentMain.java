package Task8.Task8_3;


import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMain {

    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        Thread[] concurrentThreads = new Thread[10];
        for (int i = 0; i < concurrentThreads.length; i++) {
            concurrentThreads[i] = new Thread(new ConcurrentMapWriter(concurrentHashMap));
        }
        Thread[] concurrentThreadsReaders = new Thread[10];
        for (int i = 0; i < concurrentThreadsReaders.length; i++) {
            concurrentThreadsReaders[i] = new Thread(new ConcurrentMapReader(concurrentHashMap));
        }
        Date concurrentStart = new Date();
        for (Thread thread : concurrentThreads) {
            thread.start();
            thread.join();
        }
        for (Thread thread : concurrentThreadsReaders) {
            thread.start();
            thread.join();
        }

        Date concurrentFinish = new Date();
        System.out.println("Time with ConcurrentHashMap " + (concurrentFinish.getTime() - concurrentStart.getTime()) + " ms");
    }
}
