package Task8.Task8_3;


import java.util.HashMap;
import java.util.Map;

public class MapWriter implements Runnable {
    Map<Integer, Integer> hashMap;

    public MapWriter(HashMap<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            synchronized (hashMap) {
                hashMap.put(i, i);
            }
        }
    }
}
