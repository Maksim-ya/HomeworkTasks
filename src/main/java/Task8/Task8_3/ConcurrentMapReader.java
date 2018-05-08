package Task8.Task8_3;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapReader implements  Runnable{
    Map<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();

    public ConcurrentMapReader(ConcurrentHashMap<Integer, Integer> hashMap) {
        this.concurrentHashMap = hashMap;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            System.out.print(concurrentHashMap.get(i)+" ");
        }
        System.out.println();
    }
}
