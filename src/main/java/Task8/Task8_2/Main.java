package Task8.Task8_2;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        Number n = new Number(0);

        Thread printer = new Thread(new Printer(n));
        printer.start();

        Thread counter = new Thread(new Counter(n));
        counter.start();

    }
}
