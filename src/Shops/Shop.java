package Shops;

import java.util.ArrayList;

public abstract class Shop {
    protected ArrayList<Product> listOfAllProducts = new ArrayList<>();

    public Product addProductsToShops(String name, Double price) {
        listOfAllProducts.add(new Product(name, price));
        return new Product(name, price);
    }

    public double buyProducts(Product product) {
        return product.getPrice();
    }

    public ArrayList<Product> getAllProductsFromShops() {
        return listOfAllProducts;
    }

    public ArrayList<Product> getProducts(ArrayList<Product> listOfProducts) {
        ArrayList<Product> found = new ArrayList<>();
        for (Product product : listOfProducts) {
            for (Product good : this.listOfAllProducts) {
                if (product.getName().equals(good.getName())) {
                    found.add(good);
                }
            }
        }
        return found;
    }
}