package Task8.Task8_4;


import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumOfArray {
    private static int[] array = new int[1_000_000];
    private static final int THREADS = 8;

    static class RecSumOfN extends RecursiveTask<Long> {
        int size;
        int[] newArray1;
        int[] newArray2;

        public RecSumOfN(int size) {
            newArray1=new int[size] ;
            for (int i=0; i < newArray1.length; i++) {
                newArray1[i] = array[i];
            }
            newArray2=new int[size] ;
            for (int i=0; i < newArray2.length; i++) {
                newArray2[i] = array[i+newArray1.length];
            }
        }
        public RecSumOfN(){
            Random rand = new Random();
            for (int i=0; i < array.length; i++) {
                array[i] = rand.nextInt(100);
            }
        }

        @Override
        public Long compute() {
            if (size < 20) {
                long localSum = 0;
                for (int i = 0; i < array.length; i++) {
                    localSum += array[i];
                }

                return localSum;
            } else {
                int  mid = array.length/ 2;
                RecSumOfN firstHalf = new RecSumOfN(mid);
                firstHalf.fork();
                RecSumOfN secondHalf = new RecSumOfN(mid);
                long resultSecond = secondHalf.compute();
                return firstHalf.join() + resultSecond;
            }
        }
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(THREADS);
        long computedSum = pool.invoke(new RecSumOfN());
        System.out.println("Summa = "+computedSum);
    }
}
