package Task1_2;


public class CheckNumber {
    public int checkNumber(int number)  {

        if (!(number<=Integer.MAX_VALUE&number>0)){
            System.out.println("Invalid input. Enter a Positive Integer number");
            System.exit(1);

        }
        return number;
    }
}
