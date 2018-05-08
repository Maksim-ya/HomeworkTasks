package Task8.Task8_2;


public class Printer implements Runnable {
     Number n;

    public Printer(Number n) {
        this.n = n;
    }

    @Override
    public void run() {

        for (int j = 0; j < 1000;j++) {
            n.print();
        }
    }
}
