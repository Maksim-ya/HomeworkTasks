package FlowerShop.com.maksim.model.bouquets;


import FlowerShop.com.maksim.model.flowers.Flower;
import FlowerShop.com.maksim.service.FlowerComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Bouquet {
    private final double accessories = 10;
    private double price;
    private ArrayList<Flower> bouquet = new ArrayList<Flower>();

    public Bouquet() {
    }

    public void addFlowersInBouquet(int number, BouquetFactory bouquetFactory) {
        for (int i = 0; i < number; i++) {
            bouquet.add(bouquetFactory.createFlower());
        }
    }

    public void sortByFreshness() {
        Collections.sort(bouquet, new FlowerComparator());
        printBouquet();
    }

    public double getPrice() {
        price = accessories;
        for (int i = 0; i < bouquet.size(); i++) {
            price += bouquet.get(i).getPrice();
        }
        return price;
    }

    public void printBouquet() {
        System.out.println("All Bouquet: price=" + getPrice() +
                " including accessories = 10 grn.");

        for (int i = 0; i < bouquet.size(); i++) {
            System.out.println(bouquet.get(i));
        }
    }

    public void getFlowerByLenght(double min, double max) {
        int count = 0;
        for (int i = 0; i < bouquet.size(); i++) {
            if ((bouquet.get(i).getStemLength() >= min) & (bouquet.get(i).getStemLength() < max)) {
                System.out.println(bouquet.get(i));
            } else count++;
            if (count == bouquet.size()) {
                System.out.println("This is not flowers in range min "+ min+ " and max "+max+" metres.");
            }
        }
    }
}
