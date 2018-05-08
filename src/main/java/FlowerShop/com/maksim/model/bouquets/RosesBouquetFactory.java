package FlowerShop.com.maksim.model.bouquets;

import FlowerShop.com.maksim.model.flowers.Flower;
import FlowerShop.com.maksim.model.flowers.Freshness;
import FlowerShop.com.maksim.model.flowers.Rose;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RosesBouquetFactory extends BouquetFactory{

    private double roseStemLength(){
        double roseStemLength= Rose.minLength+new Random().nextDouble()*(Rose.maxLength-Rose.minLength);
        return new BigDecimal(roseStemLength).setScale(2, RoundingMode.UP).doubleValue();
    }

    @Override
    public Flower createFlower() {
        int freshLevel= new Random().nextInt(Freshness.values().length);

        Flower flower = new Rose(Freshness.values()[freshLevel],
                roseStemLength(),
                Rose.freshFlowerPrice*Flower.priceByFreshness(Freshness.values()[freshLevel])
        );
        return flower;
    }
}
