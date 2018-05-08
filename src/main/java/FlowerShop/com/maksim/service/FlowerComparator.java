package FlowerShop.com.maksim.service;


import FlowerShop.com.maksim.model.flowers.Flower;
import FlowerShop.com.maksim.model.flowers.Freshness;


import java.util.Comparator;

public class FlowerComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Freshness flower1 = ((Flower)o1).getFreshness();
        Freshness flower2 = ((Flower) o2).getFreshness();
        return  flower1.compareTo(flower2);
    }
}
