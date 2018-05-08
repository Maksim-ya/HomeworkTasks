package Task4;



public class Main {
    public static void main(String[] args) {

        for(Cats cat : Cats.values()) {
            System.out.println(cat);
        }
        System.out.println(Cats.valuesOf("BARSIK"));
    }
}

