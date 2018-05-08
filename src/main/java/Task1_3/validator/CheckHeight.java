package Task1_3.validator;


public class CheckHeight {
    public int checkHeight(int number)  {

        if (!(number<=9&number>0)){
            System.out.println("Invalid input. Enter a Positive Integer number less that 10!");
            System.exit(1);

        }
        return number;
    }
}
