package FlowerShop.com.maksim.model.flowers;


public class Rose extends Flower {
    public static double freshFlowerPrice=100.00;
    public static double minLength=0.2;
    public static double maxLength=1.5;
    private String name;

    public Rose() {
    }

    @Override
    public String setName() {
        return "Rose";
    }

    public Rose(Freshness freshness, double stemLength, double price) {
        super(freshness, stemLength, price );
        this.name = setName();
    }
}
