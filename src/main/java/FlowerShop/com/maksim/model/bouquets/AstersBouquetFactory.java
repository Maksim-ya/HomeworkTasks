package FlowerShop.com.maksim.model.bouquets;

import FlowerShop.com.maksim.model.flowers.Aster;
import FlowerShop.com.maksim.model.flowers.Flower;
import FlowerShop.com.maksim.model.flowers.Freshness;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class AstersBouquetFactory extends BouquetFactory {
    private double asterStemLength(){
        double asterStemLength= Aster.minLength+new Random().nextDouble()*(Aster.maxLength-Aster.minLength);
        return new BigDecimal(asterStemLength).setScale(2, RoundingMode.UP).doubleValue();
    }

    @Override
    public Flower createFlower() {
        int freshLevel= new Random().nextInt(Freshness.values().length);

        Flower flower = new Aster(Freshness.values()[freshLevel],
                asterStemLength(),
                Aster.freshFlowerPrice*Flower.priceByFreshness(Freshness.values()[freshLevel])
        );
        return flower;
    }
}
