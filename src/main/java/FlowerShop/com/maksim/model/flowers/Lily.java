package FlowerShop.com.maksim.model.flowers;


public class Lily extends  Flower{
    public static double freshFlowerPrice=80.00;
    public static double minLength=0.15;
    public static double maxLength=1.5;
    private String name;

    public Lily() {
    }

    @Override
    public String setName() {
        return "Lily";
    }

    public Lily(Freshness freshness, double stemLength, double price) {
        super(freshness, stemLength, price );
        this.name = setName();
    }
}
