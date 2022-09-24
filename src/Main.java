import Shops.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Wife wife = new Wife();
        ArrayList<Product> neededProducts = wife.createListOfProducts();
        Husband husband = new Husband(3000);
        husband.getListFromWife(neededProducts);

        ArrayList<Product> listOfAllProducts = husband.createListOfAllProductsFromShops();
        wife.takeListOfAllProductsFromHusband(listOfAllProducts);
        wife.printToConsoleTotalList();

        ArrayList<Product> listOfFoundProducts = husband.boughtProducts();
        wife.takeListOfFoundProductsFromHusband(listOfFoundProducts);
        wife.printToConsoleListOfFoundProducts();

        wife.takeSpentMoneyWithoutDiscount(husband.priceOfProductsWithoutDiscount());
        husband.priceOfProductsWithDiscount();

        wife.takeSpentMoneyWithDiscount(husband.getSpentMoney());
        wife.takeMoney(husband.getMoney());

        wife.printToConsoleInfoAboutMoney();

    }
}