package FlowerShop.com.maksim.model.flowers;


public abstract class Flower {
    private static int count;
    private  int id;
    private Freshness freshness;
    private double stemLength;
    private double price;
    private String name;

    public Flower() {
    }

    public Flower(Freshness freshness, double stemLength, double price) {
        this.id=++count;
        this.freshness = freshness;
        this.stemLength = stemLength;
        this.price = price;
        this.name = setName();
        count=id;
    }



    public static double priceByFreshness(Freshness freshness){
        double price=0.0;
        switch (freshness){
            case VERY_FRESH:
                price= 1.25;
                break;
            case FRESH:
                price= 1.00;
                break;
            case NOT_FRESH:
                price= 0.5;
                break;
            case WITHERING:
                price= 0.25;
                break;
        }
        return price;
    }

    public abstract String setName();

    public Freshness getFreshness() {
        return freshness;
    }

    public double getStemLength() {
        return stemLength;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Flower"+id+ "{" +
                " name='" + name +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +" m."+
                ", price=" + price +" grn."+
                '}'+'\n';
    }
}
