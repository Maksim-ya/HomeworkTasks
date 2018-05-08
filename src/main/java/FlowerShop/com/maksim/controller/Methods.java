package FlowerShop.com.maksim.controller;



import FlowerShop.com.maksim.model.bouquets.*;
import FlowerShop.com.maksim.view.Menu;

import java.util.Scanner;

public class Methods {
    private Scanner in = new Scanner(System.in);
    private BouquetFactory bouquetFactory;
    Bouquet ourBouquet = new Bouquet();

    private boolean b = true;

    public void run() {
        while (b) {
            chooseAction();
        }
        createBouquet();
    }

    private void chooseAction() {
        Menu.printMainMenu();
        String choise = in.next();
        in.nextLine();
        if (choise.matches("\\d")) {
            switch (Integer.parseInt(choise)) {
                default:
                    System.out.println("Please choose number from 1 to 7");
                    break;
                case 1:
                    bouquetFactory = new RosesBouquetFactory();
                    b = false;
                    break;
                case 2:
                    bouquetFactory = new TulipsBouquetFactory();
                    b = false;
                    break;
                case 3:
                    bouquetFactory = new AstersBouquetFactory();
                    b = false;
                    break;
                case 4:
                    bouquetFactory = new LiliesBouquetFactory();
                    b = false;
                    break;
                case 5:
                    ourBouquet.sortByFreshness();
                    break;
                case 6:
                    getRange();
                    break;
                case 7:
                    System.exit(1);
                    break;
            }
        } else {
            Menu.printError();
        }
    }

    private void createBouquet() {
        System.out.println("Enter number of flowers:");
        String choise = in.next();
        in.nextLine();
        if (choise.matches("\\d+")) {
            ourBouquet.addFlowersInBouquet(Integer.parseInt(choise), bouquetFactory);
            b=true;
            ourBouquet.printBouquet();
        } else {
            Menu.printError();
        }
        run();
    }

    private void getRange() {
        System.out.println("Enter min lenght:");
        String min = in.next();
        in.nextLine();
        System.out.println("Enter max lenght:");
        String max = in.next();
        in.nextLine();
        if ((min.matches("\\d+[.]?\\d*"))&(max.matches("\\d+[.]?\\d*"))) {
            ourBouquet.getFlowerByLenght(Double.parseDouble(min),Double.parseDouble(max));
        } else {
            Menu.printError();
        }
        run();
    }
}
