package Task8.Task8_3;

import java.util.HashMap;
import java.util.Map;

public class MapReader implements  Runnable{
    Map<Integer, Integer> hashMap ;

    public MapReader(HashMap<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            synchronized (hashMap) {
                System.out.print(hashMap.get(i) + " ");
            }
        }
        System.out.println();
    }
}
