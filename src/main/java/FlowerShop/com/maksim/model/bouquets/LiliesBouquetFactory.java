package FlowerShop.com.maksim.model.bouquets;


import FlowerShop.com.maksim.model.flowers.Flower;
import FlowerShop.com.maksim.model.flowers.Freshness;
import FlowerShop.com.maksim.model.flowers.Lily;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class LiliesBouquetFactory extends BouquetFactory {
    private double lilyStemLength(){
        double lilyStemLength= Lily.minLength+new Random().nextDouble()*(Lily.maxLength-Lily.minLength);
        return new BigDecimal(lilyStemLength).setScale(2, RoundingMode.UP).doubleValue();
    }

    @Override
    public Flower createFlower() {
        int freshLevel= new Random().nextInt(Freshness.values().length);

        Flower flower = new Lily(Freshness.values()[freshLevel],
                lilyStemLength(),
                Lily.freshFlowerPrice*Flower.priceByFreshness(Freshness.values()[freshLevel])
        );
        return flower;
    }
}
