package FlowerShop.com.maksim.model.flowers;


public class Tulip extends  Flower{
    public static double freshFlowerPrice=30.00;
    public static double minLength=0.1;
    public static double maxLength=0.7;
    private String name;

    public Tulip() {
    }

    @Override
    public String setName() {
        return "Tulip";
    }

    public Tulip(Freshness freshness, double stemLength, double price) {
        super(freshness, stemLength, price );
        this.name = setName();
    }
}
