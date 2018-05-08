package FlowerShop.com.maksim.view;


public class Menu {
    public static void printMainMenu(){
        System.out.println("Today we can offer roses, tulips, asters and lilies."+'\n'+
        "To select roses press - 1"+'\n'+
        "To select tulips press - 2"+'\n'+
        "To select asters press - 3"+'\n'+
        "To select lilies press - 4"+'\n'+
        "To sort flowers in bouquet by freshness press - 5"+'\n'+
        "To look at all  flowers in bouquet by range press - 6"+'\n'+
        "For exit press - 7");
    }
    public static void printError(){
        System.out.println("This is not a number!!");
    }
}
