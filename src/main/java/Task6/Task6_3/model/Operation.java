package Task6.Task6_3.model;

public class Operation {
    private double number;

    public Operation() {
    }

    public Operation(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "number=" + number +
                '}';
    }
    public  void increment(){
        this.number++;

    }
    public  void decrement(){
        number--;
    }
    public  void changeSign(){
        this.number=-number;
    }
}
