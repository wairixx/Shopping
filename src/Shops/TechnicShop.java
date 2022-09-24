package Shops;

import java.util.ArrayList;

public class TechnicShop extends Shop {
    private ArrayList<Product> listOfTechnicProducts = new ArrayList<>();

    public TechnicShop() {
        listOfTechnicProducts.add(addProductsToShops("XiaomiPhone", 100.0));
        listOfTechnicProducts.add(addProductsToShops("AcerNotebook", 180.0));
        listOfTechnicProducts.add(addProductsToShops("LenovoPhone", 150.0));
        listOfTechnicProducts.add(addProductsToShops("MacBook", 210.0));
        listOfTechnicProducts.add(addProductsToShops("SonyTV", 200.0));

    }

    @Override
    public double buyProducts(Product product) {
        if (product.getName().equals("SonyTV")) {
            return product.getPrice() / 2.5;
        }
        else if (product.getName().equals("MacBook")){
            return product.getPrice() / 2;
        }
        return product.getPrice();

    }

    public ArrayList<Product> getAllProductsFromShops() {
        return listOfTechnicProducts;
    }
}