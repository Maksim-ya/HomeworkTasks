package Task8.Task8_2;


public class Number {
    int i ;
    boolean flag= false;

    public Number(int i) {
        this.i = i;
    }

    public synchronized void increment() {
        while (!flag) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
       }
        i++;

        notify();
        flag=false;
    }
    public synchronized void print() {
        while (flag) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        System.out.print(i+" ");

        notify();
        flag=true;
    }
}
