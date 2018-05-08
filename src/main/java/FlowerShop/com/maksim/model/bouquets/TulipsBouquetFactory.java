package FlowerShop.com.maksim.model.bouquets;


import FlowerShop.com.maksim.model.flowers.Flower;
import FlowerShop.com.maksim.model.flowers.Freshness;
import FlowerShop.com.maksim.model.flowers.Tulip;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class TulipsBouquetFactory extends BouquetFactory {
    private double tulipStemLength(){
        double tulipStemLength= Tulip.minLength+new Random().nextDouble()*(Tulip.maxLength-Tulip.minLength);
        return new BigDecimal(tulipStemLength).setScale(2, RoundingMode.UP).doubleValue();
    }

    @Override
    public Flower createFlower() {
        int freshLevel= new Random().nextInt(Freshness.values().length);

        Flower flower = new Tulip(Freshness.values()[freshLevel],
                tulipStemLength(),
                Tulip.freshFlowerPrice*Flower.priceByFreshness(Freshness.values()[freshLevel])
        );
        return flower;
    }
}
