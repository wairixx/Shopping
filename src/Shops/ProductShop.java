package Shops;


import java.util.ArrayList;

public class ProductShop extends Shop {
    private ArrayList<Product> listOfProductsFromProductShop = new ArrayList<>();

    public ProductShop() {
        listOfProductsFromProductShop.add(addProductsToShops("Milk", 60.0));
        listOfProductsFromProductShop.add(addProductsToShops("Pears", 35.0));
        listOfProductsFromProductShop.add(addProductsToShops("Butter", 70.0));
        listOfProductsFromProductShop.add(addProductsToShops("Fish", 90.0));

    }

    @Override
    public double buyProducts(Product product) {
        if (product.getName().equals("Milk") || product.getName().equals("Apples")) {
            return product.getPrice() / 2;
        }
        return product.getPrice();
    }

    public ArrayList<Product> getAllProductsFromShops() {
        return listOfProductsFromProductShop;
    }
}
