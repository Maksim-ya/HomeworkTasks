package Task8.Task8_2;


public class Counter implements Runnable {
     Number n;

    public Counter(Number n) {
        this.n = n;
    }

    @Override
    public  void run() {
        for (int k = 0; k < 1000;k++) {
            n.increment();
        }
    }
}
