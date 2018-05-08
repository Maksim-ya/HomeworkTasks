package FlowerShop.com.maksim.model.flowers;


public class Aster extends  Flower {
    public static double freshFlowerPrice=50.00;
    public static double minLength=0.1;
    public static double maxLength=1;
    private String name;

    public Aster() {
    }

    @Override
    public String setName() {
        return "Aster";
    }

    public Aster(Freshness freshness, double stemLength, double price) {
        super(freshness, stemLength, price );
        this.name = setName();
    }
}
